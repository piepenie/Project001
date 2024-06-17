package com.example.jobKoreaIt.domain.common.dto;


import lombok.Data;

@Data
public class Criteria { // 페이징 처리를 위한 DTO
    private int pageno;	 			//현재 페이지
    private int amount;	 			//표시할 게시물 양(10건)
    private String type;			//	제목,작성자,게시물번호
    private String keyword;			//	포함문자열


    public Criteria() { // 생성자로 무조건 실행되며, 1페이지에 게시물을 10개씩 보여줌?
        pageno = 1;
        amount = 10;
    }
    public Criteria(int no,int amt) {
        pageno = no;
        amount = amt;
    }
}
