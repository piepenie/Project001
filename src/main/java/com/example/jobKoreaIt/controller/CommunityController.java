package com.example.jobKoreaIt.controller;


import com.example.jobKoreaIt.domain.common.dto.CommunityDto;
import com.example.jobKoreaIt.domain.common.dto.Criteria;
import com.example.jobKoreaIt.domain.common.dto.PageDto;
import com.example.jobKoreaIt.domain.common.entity.Community;
import com.example.jobKoreaIt.domain.common.service.CommunityServiceImpl;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import jakarta.websocket.DeploymentException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
@Slf4j
@RequestMapping("/community")
public class CommunityController {

    @Autowired
    private CommunityServiceImpl communityService;

    @GetMapping("/index")
    public void index(){
        log.info("GET /community/index...");
    }

    @GetMapping("/add")
    public void add(){
        log.info("GET /community/add.css...");
    }


    @PostMapping("/add")
    public String add_post(@ModelAttribute  @Valid CommunityDto dto, BindingResult bindingResult, Model model) throws IOException {
        log.info("GET /community/add..." + dto);
        //유효성 검사
        if(bindingResult.hasFieldErrors()) {
            for(FieldError error  : bindingResult.getFieldErrors()) {
                log.info(error.getField()+ " : " + error.getDefaultMessage());
                model.addAttribute(error.getField(), error.getDefaultMessage());
            }
            return "community/add";
        }
        //서비스 실행
        boolean isadded = communityService.addCommunity(dto);
        if(!isadded)
            return "community/add";

        return "redirect:/community/list";
    }

    @GetMapping("/list") // 리스트로 들어오면, 실행되는 컨트롤러
    // @RequestParam 어노테이션은 정수형인 pageNo 와 "pageNo" 이라고 요청받는 문자열을 매핑 시키며, required = false 에 의해서 요청이없더라도 오류가 발생하지않음.
    public String list(@RequestParam(value = "pageNo" ,required = false)Integer pageNo, Model model, HttpServletResponse response) throws Exception {
        log.info("GET /community/list... " + pageNo + " " );
//        System.out.println("pageNo = " + pageNo + ", model = " + model + ", response = " + response);


        //----------------
        //PageDto  Start
        //----------------
        Criteria criteria = null; // 페이징 처리, criteria 초기화 null 값으로 시작
        if(pageNo==null) { // 만약 null 값이라면, pageNo=1 페이지가 되는거고,
            //최초 /community/list 접근
            pageNo=1; // pageNo 는 1로 초기화 해주고,
            criteria = new Criteria();  //pageno=1 , amount=10
            // DTO 에 있는 Criteria() 메서드가 실행됨.
        }
        else {
            criteria = new Criteria(pageNo,10); //페이지이동 요청 했을때 Null값이 아니라면 10번이라는 값을 넣어주고 실행시킴
        }
        //--------------------
        //Search
        //--------------------
//        criteria.setType(type);
//        criteria.setKeyword(keyword);

        //서비스 실행 조건문을 통과한 후
        Map<String,Object> map = communityService.GetCommunityList(criteria);
        // Map 클래스를 타입형으로 받는 map 변수에 criteria 를 매개변수로 넣은 서비스 결과물을 넣는다.

        PageDto pageDto = (PageDto) map.get("pageDto"); // PageDto 변수에는 맵에 "pageDto" 요청 값을 넣은 결과를 넣음
        int total = (int)map.get("total");

        List<Community> list = (List<Community>) map.get("list");

        //Entity -> Dto
//        List<Community>  communityList =  list.stream().map(community -> Community.Of(community)).collect(Collectors.toList());
//        System.out.println(communityList);

        //View 전달 뷰에서 전달
        model.addAttribute("list",list);
        model.addAttribute("total",total);
        model.addAttribute("pageNo",pageNo);
        model.addAttribute("pageDto",pageDto);

        //--------------------------------
        //COUNT UP - //쿠키 생성(/board/read.do 새로고침시 조회수 반복증가를 막기위한용도)
        //--------------------------------
//        Cookie init = new Cookie("reading","true");
//        response.addCookie(init);

        return "community/list";
    }


    @GetMapping("/read")
    public void read(@RequestParam("no") Long no , @RequestParam("pageNo") Long pageNo,Model model){
        log.info("GET /community/read...no : " + no + " pageNo :" + pageNo);
        Community community =  communityService.getCommunity(no);

        model.addAttribute("community",community);
        model.addAttribute("pageNo",pageNo);

    }

    @GetMapping("/update")  // 리스트에서 게시물 타이틀을 눌렀을때 받는 주소로 이동
    public String update(@RequestParam("no") Long no, @RequestParam("pageNo") Long pageNo,Model model){ //
        log.info("GET /community/update...no : " + no + " pageNo : " + pageNo);
            Community community = communityService.getCommunityNo(no);
            log.info("community : " + community);
            if (community != null) {
                model.addAttribute("community", community);
                model.addAttribute("pageNo", pageNo);
                model.addAttribute("no", no);
            return "community/update";
        } else {
            return "redirect:/community/list";
        }
    }

    @PostMapping("/update")
    public String post_update(CommunityDto dto, @RequestParam("pageNo") Long pageNo) {
        System.out.println("POST /update/..dto : " + dto + " pageNo : " + pageNo);
        Community community = communityService.getCommunityNo(dto.getNo());
        if (community != null) {
            communityService.updateCommunity(community, dto);
            return "redirect:/community/read?no=" + dto.getNo()+"&pageNo="+pageNo; // 수정 후 읽기 페이지로 리디렉션
        } else {
            return "redirect:/community/list"; // 실패 시 목록 페이지로 리디렉션
        }
    }

    @GetMapping("/delete")
    public String delete_pots(@RequestParam("no") Long no, @RequestParam("pageNo") Long pageNo){
        System.out.println(", pageNo = " + pageNo);
        Community community = communityService.getCommunityNo(no);
        communityService.deleteCommunity(community);
        return "redirect:/community/list";
    }

}
