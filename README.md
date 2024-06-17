# 구인구직웹 프로젝트

DEVELOPMENT MOTIVATION
---
> 구인구직싸이트 -
> > 구인구직을 하는 입장에서 사람인이나 잡코리아와 같은 사이트 <br> 
> > 보다 더 간편하게 정보를 수집할 수 있는 사이트 <br> 
 

HISTORY
---
[TOTAL](DOCUMENT/HISTORY/TOTAL) | [나재현](DOCUMENT/HISTORY/나재현) | [이동환](DOCUMENT/HISTORY/이동환) | [박정현](DOCUMENT/HISTORY/박정현) | [최원준](DOCUMENT/HISTORY/최원준) |


PLANS
---
 |LANGUAGE|PLAN|IMPLEMENT|DESCRIPTION|
 |-|-|-|-|
 |JAVA|2024/04/08 ~ 2024/04/23|-|-|
 |JSP/SERVLET|2024/04/24 ~ 2024/04/28|-|-|
 |SPRING STS3|2024/04/28 ~ 2024/05/14|-|-|
 |SPRING BOOT|2024/05/15 ~ 2024/06/30|-|-|
 
 

MEMBERERS
--- 
|NAME|ROLE|DETAILS|DESCRIPTION| 
|---|---|---|---|
|정우균|FN| FrontController / Docment 관리 / Dependencies  관리 |---|
|최원준|FN| 모든PAGE와 서버간 REQ / RESP |---|
|나재현|BN| OFFER - 회원가입 / 회원탈퇴 / 기업정보 CRUD|---|
|이동환|BN| 유저공통 - 로그인 / 로그아웃|---|
|박정현|BN| SEEKER 회원가입 회원탈퇴 이력서 CRUD|---|

SKILLS
---

#### FN
---
<img src="https://img.shields.io/badge/HTML5-3366CC?style=for-the-badge&logo=htmlacademy&logoColor=white"> <img src="https://img.shields.io/badge/CSS-1572B6?style=for-the-badge&logo=css3&logoColor=white"> <img src="https://img.shields.io/badge/JAVASCRIPT-F7DF1E?style=for-the-badge&logo=javascript&logoColor=white"> <img src="https://img.shields.io/badge/JQUERY-0769AD?style=for-the-badge&logo=jquery&logoColor=white"> 


#### BN
---
<img src="https://img.shields.io/badge/JAVA-005571?style=for-the-badge&logo=doubanread&logoColor=white"> <img src="https://img.shields.io/badge/JSP-1E8CBE?style=for-the-badge&logo=doubanread&logoColor=white"> <img src="https://img.shields.io/badge/SERVLET-4B4B77?style=for-the-badge&logo=doubanread&logoColor=white"> <img src="https://img.shields.io/badge/SPRING-STS3-6DB33F?style=for-the-badge&logo=spring&logoColor=white"> <img src="https://img.shields.io/badge/SPRINGBOOT-6DB33F?style=for-the-badge&logo=springboot&logoColor=white"> 

#### DATABASE
---
<img src="https://img.shields.io/badge/MYSQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white">  


#### DEVOPS
---
<img src="https://img.shields.io/badge/GIT-F05032?style=for-the-badge&logo=git&logoColor=white"> <img src="https://img.shields.io/badge/GITHUB-181717?style=for-the-badge&logo=github2&logoColor=white"> <img src="https://img.shields.io/badge/AWS-EC2-FF9900?style=for-the-badge&logo=amazonec2&logoColor=white"> <img src="https://img.shields.io/badge/DOCKER-2496ED?style=for-the-badge&logo=docker&logoColor=white"> <img src="https://img.shields.io/badge/DOCKERHUB-2496ED?style=for-the-badge&logo=docker&logoColor=white"> <img src="https://img.shields.io/badge/JENKINS-D24939?style=for-the-badge&logo=jenkins&logoColor=white"> 


END POINT DOC
---
|URI|REQUEST METHOD|REQUEST PARAMETER TYPE|RESPONSE VALUE TYPE|DESCRIPTION|
|---|---|---|---|---|
|/user/confirmid|GET/POST|NICKNAME POHNE TYPE|String|---|
|/user/confirmpw|GET/POST|NICKNAME USERNAME PHONE|String|---|
|---|---|---|---|---|
|/seeker/resume/add|GET/POST|form|String|---|
|/seeker/resume/update|GET/POST|ID|String|---|
|/seeker/resume/read|GET|ID|String|---|
|/seeker/resume/list|GET|---|String|---|
|/seeker/delete|GET/POST|ID|String|---|
|---|---|---|---|---|

DEPENDENCIES LIST
---
|CAT|NAME|DESCRIPTION|LINK|-|-|
|-|-|-|-|-|-|
|FN|WEB|BOOT WEB|org.springframework.boot:spring-boot-starter-web|-|-|
|FN|THYMELEAF|THYMELEAF|org.springframework.boot:spring-boot-starter-thymeleaf|-|-|
|BN|LOMBOK|LOMBOK|org.projectlombok:lombok|-|-|
|BN|SPRING_SECURITY|SPRING_SECURITY|org.springframework.boot:spring-boot-starter-security|-|-|
|BN|SECURITY+THYMELEAF|SECURITY+THYMELEAF|org.thymeleaf.extras:thymeleaf-extras-springsecurity6|-|-|
|BN|ORM_JPA|ORM_JPA|org.springframework.boot:spring-boot-starter-data-jpa|-|-|
|BN|MAIL|MAIL|org.springframework.boot:spring-boot-starter-mail|-|-|
|BN|DEVTOOLS|DEVTOOLS|org.springframework.boot:spring-boot-devtools|-|-|
|BN|VALIDATOR|VALIDATOR|org.springframework.boot:spring-boot-starter-validation|-|-|
|BN|OAUTH2-Client|OAUTH2-Client|org.springframework.boot:spring-boot-starter-oauth2-client|-|-|
|BN|TX|TX|org.springframework:spring-tx|-|-|
|DB|DBCONN BASIC|DBCONN BASIC|org.springframework.boot:spring-boot-starter-jdbc|-|-|
|DEVOPS|-|-|-|-|-|


ERD[KoreaJobDb]
---
![20240425155554](https://github.com/jungwoogyun/EM-01-PROJECTS/assets/84259104/8631169d-3c85-4be4-a097-613bf1e5b7e0)




FILE TREES[JSP/SERVLET]
--- 
```
C:.
│  .gitignore
│  build.gradle
│  gradlew
│  gradlew.bat
│  settings.gradle
│
├─.gradle
│  │  file-system.probe
│  │
│  ├─8.7
│  │  │  gc.properties
│  │  │
│  │  ├─checksums
│  │  │      checksums.lock
│  │  │
│  │  ├─dependencies-accessors
│  │  │      gc.properties
│  │  │
│  │  ├─executionHistory
│  │  │      executionHistory.bin
│  │  │      executionHistory.lock
│  │  │
│  │  ├─expanded
│  │  ├─fileChanges
│  │  │      last-build.bin
│  │  │
│  │  ├─fileHashes
│  │  │      fileHashes.bin
│  │  │      fileHashes.lock
│  │  │      resourceHashesCache.bin
│  │  │
│  │  └─vcsMetadata
│  ├─buildOutputCleanup
│  │      buildOutputCleanup.lock
│  │      cache.properties
│  │      outputFiles.bin
│  │
│  └─vcs-1
│          gc.properties
│
├─.idea
│      .gitignore
│      .name
│      0614(delete.iml
│      0614(update).iml
│      compiler.xml
│      gradle.xml
│      jarRepositories.xml
│      misc.xml
│      vcs.xml
│      workspace.xml
│      새 폴더 (3) (2).iml
│
├─build
│  ├─classes
│  │  └─java
│  │      └─main
│  │          └─com
│  │              └─example
│  │                  └─jobKoreaIt
│  │                      │  JobKoreaItApplication.class
│  │                      │
│  │                      ├─config
│  │                      │  │  DataSourceConfig.class
│  │                      │  │  MultipartConfig.class
│  │                      │  │  SecurityConfig.class
│  │                      │  │  TxConfig.class
│  │                      │  │  WebMvcConfig.class
│  │                      │  │
│  │                      │  └─auth
│  │                      │      │  PrincipalDetails$1.class
│  │                      │      │  PrincipalDetails.class
│  │                      │      │  PrincipalDetailsOAuth2Service.class
│  │                      │      │  PrincipalDetailsService.class
│  │                      │      │
│  │                      │      ├─exceptionHandler
│  │                      │      │      CustomAccessDeniedHandler.class
│  │                      │      │      CustomAuthenticationEntryPoint.class
│  │                      │      │
│  │                      │      ├─jwt
│  │                      │      │      JwtAuthorizationFilter.class
│  │                      │      │      JwtProperties.class
│  │                      │      │      JwtTokenProvider.class
│  │                      │      │      KeyGenerator.class
│  │                      │      │      TokenInfo$TokenInfoBuilder.class
│  │                      │      │      TokenInfo.class
│  │                      │      │
│  │                      │      ├─loginHandler
│  │                      │      │      CustomAuthenticationFailureHandler.class
│  │                      │      │      CustomLoginSuccessHandler.class
│  │                      │      │      Oauth2JwtLoginSuccessHandler.class
│  │                      │      │
│  │                      │      ├─logoutHandler
│  │                      │      │      CustomLogoutHandler.class
│  │                      │      │      CustomLogoutSuccessHandler.class
│  │                      │      │
│  │                      │      └─provider
│  │                      │              GoogleUserInfo.class
│  │                      │              KakaoUserInfo.class
│  │                      │              NaverUserInfo.class
│  │                      │              OAuth2UserInfo.class
│  │                      │
│  │                      ├─controller
│  │                      │  │  CommunityController.class
│  │                      │  │  HomeController.class
│  │                      │  │
│  │                      │  └─user
│  │                      │      │  UserController.class
│  │                      │      │
│  │                      │      ├─offer
│  │                      │      │      OfferController.class
│  │                      │      │      OfferRestController.class
│  │                      │      │
│  │                      │      └─seeker
│  │                      │              SeekerController.class
│  │                      │              SeekerRestController.class
│  │                      │
│  │                      ├─domain
│  │                      │  ├─common
│  │                      │  │  ├─dto
│  │                      │  │  │      CommunityDto$CommunityDtoBuilder.class
│  │                      │  │  │      CommunityDto.class
│  │                      │  │  │      Criteria.class
│  │                      │  │  │      PageDto.class
│  │                      │  │  │      UserDto$UserDtoBuilder.class
│  │                      │  │  │      UserDto.class
│  │                      │  │  │
│  │                      │  │  ├─entity
│  │                      │  │  │      Community$CommunityBuilder.class
│  │                      │  │  │      Community.class
│  │                      │  │  │      Signature.class
│  │                      │  │  │      User$UserBuilder.class
│  │                      │  │  │      User.class
│  │                      │  │  │
│  │                      │  │  ├─repository
│  │                      │  │  │      CommunityRepository.class
│  │                      │  │  │      UserRepository.class
│  │                      │  │  │
│  │                      │  │  └─service
│  │                      │  │          CommunityServiceImpl.class
│  │                      │  │          UserService.class
│  │                      │  │          UserServiceImpl.class
│  │                      │  │
│  │                      │  ├─offer
│  │                      │  │  ├─dto
│  │                      │  │  │      CompanyDto.class
│  │                      │  │  │      OfferDto.class
│  │                      │  │  │
│  │                      │  │  ├─entity
│  │                      │  │  │      Company.class
│  │                      │  │  │      JobOffer.class
│  │                      │  │  │
│  │                      │  │  ├─repository
│  │                      │  │  │      CompanyRepository.class
│  │                      │  │  │      JobOfferRepository.class
│  │                      │  │  │
│  │                      │  │  └─service
│  │                      │  │          JobOfferServiceImpl.class
│  │                      │  │
│  │                      │  └─seeker
│  │                      │      ├─dto
│  │                      │      │      SeekerDto.class
│  │                      │      │
│  │                      │      ├─entity
│  │                      │      │      JobSeeker.class
│  │                      │      │      Resume.class
│  │                      │      │
│  │                      │      ├─repository
│  │                      │      │      JobSeekerRepository.class
│  │                      │      │      ResumeRepository.class
│  │                      │      │
│  │                      │      └─service
│  │                      │              JobSeekerServiceImpl.class
│  │                      │
│  │                      └─properties
│  │                              AUTH.class
│  │                              DBCONN.class
│  │                              UPLOADPATH.class
│  │
│  ├─generated
│  │  └─sources
│  │      ├─annotationProcessor
│  │      │  └─java
│  │      │      └─main
│  │      └─headers
│  │          └─java
│  │              └─main
│  ├─resources
│  │  └─main
│  │      │  application.properties
│  │      │  data.sql
│  │      │  schema.sql
│  │      │
│  │      ├─static
│  │      │  ├─assets
│  │      │  │      facebookicon.png
│  │      │  │      githublogo.png
│  │      │  │      instraicon.png
│  │      │  │      logo.gif
│  │      │  │      logo.png
│  │      │  │      logo_2.png
│  │      │  │
│  │      │  ├─css
│  │      │  │  │  common.css
│  │      │  │  │  index.css
│  │      │  │  │
│  │      │  │  ├─community
│  │      │  │  │      add.css
│  │      │  │  │      index.css
│  │      │  │  │      list.css
│  │      │  │  │      read.css
│  │      │  │  │      update.css
│  │      │  │  │
│  │      │  │  ├─mobile
│  │      │  │  │      common.css
│  │      │  │  │
│  │      │  │  └─user
│  │      │  │          join.css
│  │      │  │          login.css
│  │      │  │
│  │      │  └─js
│  │      │      │  common.js
│  │      │      │  index.js
│  │      │      │
│  │      │      ├─community
│  │      │      │      add.js
│  │      │      │      index.js
│  │      │      │      list.js
│  │      │      │      read.js
│  │      │      │      update.js
│  │      │      │
│  │      │      └─user
│  │      │              join.js
│  │      │              login.js
│  │      │
│  │      └─templates
│  │          │  index.html
│  │          │  template_mainPage.html
│  │          │  template_subPage.html
│  │          │
│  │          ├─community
│  │          │      add.html
│  │          │      index.html
│  │          │      list.html
│  │          │      read.html
│  │          │      update.html
│  │          │
│  │          ├─fragments
│  │          │      footer.html
│  │          │      link.html
│  │          │      nav.html
│  │          │      top_header.html
│  │          │
│  │          ├─offer
│  │          │  └─company
│  │          │          add.html
│  │          │          delete.html
│  │          │          list.html
│  │          │          read.html
│  │          │          update.html
│  │          │
│  │          ├─seeker
│  │          │  │  main.html
│  │          │  │
│  │          │  └─resume
│  │          │          add.html
│  │          │          list.html
│  │          │          read.html
│  │          │          update.html
│  │          │
│  │          └─user
│  │                  join.html
│  │                  login.html
│  │                  myinfo.html
│  │
│  └─tmp
│      └─compileJava
│          │  previous-compilation-data.bin
│          │
│          └─compileTransaction
│              ├─backup-dir
│              └─stash-dir
│                      CommunityController.class.uniqueId1
│                      CommunityServiceImpl.class.uniqueId0
│
├─gradle
│  └─wrapper
│          gradle-wrapper.jar
│          gradle-wrapper.properties
│
├─out
│  ├─production
│  │  ├─classes
│  │  │  └─com
│  │  │      └─example
│  │  │          └─jobKoreaIt
│  │  │              │  JobKoreaItApplication.class
│  │  │              │
│  │  │              ├─config
│  │  │              │  │  DataSourceConfig.class
│  │  │              │  │  MultipartConfig.class
│  │  │              │  │  SecurityConfig.class
│  │  │              │  │  TxConfig.class
│  │  │              │  │  WebMvcConfig.class
│  │  │              │  │
│  │  │              │  └─auth
│  │  │              │      │  PrincipalDetails$1.class
│  │  │              │      │  PrincipalDetails.class
│  │  │              │      │  PrincipalDetailsOAuth2Service.class
│  │  │              │      │  PrincipalDetailsService.class
│  │  │              │      │
│  │  │              │      ├─exceptionHandler
│  │  │              │      │      CustomAccessDeniedHandler.class
│  │  │              │      │      CustomAuthenticationEntryPoint.class
│  │  │              │      │
│  │  │              │      ├─jwt
│  │  │              │      │      JwtAuthorizationFilter.class
│  │  │              │      │      JwtProperties.class
│  │  │              │      │      JwtTokenProvider.class
│  │  │              │      │      KeyGenerator.class
│  │  │              │      │      TokenInfo$TokenInfoBuilder.class
│  │  │              │      │      TokenInfo.class
│  │  │              │      │
│  │  │              │      ├─loginHandler
│  │  │              │      │      CustomAuthenticationFailureHandler.class
│  │  │              │      │      CustomLoginSuccessHandler.class
│  │  │              │      │      Oauth2JwtLoginSuccessHandler.class
│  │  │              │      │
│  │  │              │      ├─logoutHandler
│  │  │              │      │      CustomLogoutHandler.class
│  │  │              │      │      CustomLogoutSuccessHandler.class
│  │  │              │      │
│  │  │              │      └─provider
│  │  │              │              GoogleUserInfo.class
│  │  │              │              KakaoUserInfo.class
│  │  │              │              NaverUserInfo.class
│  │  │              │              OAuth2UserInfo.class
│  │  │              │
│  │  │              ├─controller
│  │  │              │  │  CommunityController.class
│  │  │              │  │  HomeController.class
│  │  │              │  │
│  │  │              │  └─user
│  │  │              │      │  UserController.class
│  │  │              │      │
│  │  │              │      ├─offer
│  │  │              │      │      OfferController.class
│  │  │              │      │      OfferRestController.class
│  │  │              │      │
│  │  │              │      └─seeker
│  │  │              │              SeekerController.class
│  │  │              │              SeekerRestController.class
│  │  │              │
│  │  │              ├─domain
│  │  │              │  ├─common
│  │  │              │  │  ├─dto
│  │  │              │  │  │      CommunityDto$CommunityDtoBuilder.class
│  │  │              │  │  │      CommunityDto.class
│  │  │              │  │  │      Criteria.class
│  │  │              │  │  │      PageDto.class
│  │  │              │  │  │      UserDto$UserDtoBuilder.class
│  │  │              │  │  │      UserDto.class
│  │  │              │  │  │
│  │  │              │  │  ├─entity
│  │  │              │  │  │      Community$CommunityBuilder.class
│  │  │              │  │  │      Community.class
│  │  │              │  │  │      Signature.class
│  │  │              │  │  │      User$UserBuilder.class
│  │  │              │  │  │      User.class
│  │  │              │  │  │
│  │  │              │  │  ├─repository
│  │  │              │  │  │      CommunityRepository.class
│  │  │              │  │  │      UserRepository.class
│  │  │              │  │  │
│  │  │              │  │  └─service
│  │  │              │  │          CommunityServiceImpl.class
│  │  │              │  │          UserService.class
│  │  │              │  │          UserServiceImpl.class
│  │  │              │  │
│  │  │              │  ├─offer
│  │  │              │  │  ├─dto
│  │  │              │  │  │      CompanyDto.class
│  │  │              │  │  │      OfferDto.class
│  │  │              │  │  │
│  │  │              │  │  ├─entity
│  │  │              │  │  │      Company.class
│  │  │              │  │  │      JobOffer.class
│  │  │              │  │  │
│  │  │              │  │  ├─repository
│  │  │              │  │  │      CompanyRepository.class
│  │  │              │  │  │      JobOfferRepository.class
│  │  │              │  │  │
│  │  │              │  │  └─service
│  │  │              │  │          JobOfferServiceImpl.class
│  │  │              │  │
│  │  │              │  └─seeker
│  │  │              │      ├─dto
│  │  │              │      │      SeekerDto.class
│  │  │              │      │
│  │  │              │      ├─entity
│  │  │              │      │      JobSeeker.class
│  │  │              │      │      Resume.class
│  │  │              │      │
│  │  │              │      ├─repository
│  │  │              │      │      JobSeekerRepository.class
│  │  │              │      │      ResumeRepository.class
│  │  │              │      │
│  │  │              │      └─service
│  │  │              │              JobSeekerServiceImpl.class
│  │  │              │
│  │  │              └─properties
│  │  │                      AUTH.class
│  │  │                      DBCONN.class
│  │  │                      UPLOADPATH.class
│  │  │
│  │  └─resources
│  │      │  application.properties
│  │      │  data.sql
│  │      │  schema.sql
│  │      │
│  │      ├─static
│  │      │  ├─assets
│  │      │  │      facebookicon.png
│  │      │  │      githublogo.png
│  │      │  │      instraicon.png
│  │      │  │      logo.gif
│  │      │  │      logo.png
│  │      │  │      logo_2.png
│  │      │  │
│  │      │  ├─css
│  │      │  │  │  common.css
│  │      │  │  │  index.css
│  │      │  │  │
│  │      │  │  ├─community
│  │      │  │  │      add.css
│  │      │  │  │      index.css
│  │      │  │  │      list.css
│  │      │  │  │      read.css
│  │      │  │  │      update.css
│  │      │  │  │
│  │      │  │  ├─mobile
│  │      │  │  │      common.css
│  │      │  │  │
│  │      │  │  └─user
│  │      │  │          join.css
│  │      │  │          login.css
│  │      │  │
│  │      │  └─js
│  │      │      │  common.js
│  │      │      │  index.js
│  │      │      │
│  │      │      ├─community
│  │      │      │      add.js
│  │      │      │      index.js
│  │      │      │      list.js
│  │      │      │      read.js
│  │      │      │      update.js
│  │      │      │
│  │      │      └─user
│  │      │              join.js
│  │      │              login.js
│  │      │
│  │      └─templates
│  │          │  index.html
│  │          │  template_mainPage.html
│  │          │  template_subPage.html
│  │          │
│  │          ├─community
│  │          │      add.html
│  │          │      index.html
│  │          │      list.html
│  │          │      read.html
│  │          │      update.html
│  │          │
│  │          ├─fragments
│  │          │      footer.html
│  │          │      link.html
│  │          │      nav.html
│  │          │      top_header.html
│  │          │
│  │          ├─offer
│  │          │  └─company
│  │          │          add.html
│  │          │          delete.html
│  │          │          list.html
│  │          │          read.html
│  │          │          update.html
│  │          │
│  │          ├─seeker
│  │          │  │  main.html
│  │          │  │
│  │          │  └─resume
│  │          │          add.html
│  │          │          list.html
│  │          │          read.html
│  │          │          update.html
│  │          │
│  │          └─user
│  │                  join.html
│  │                  login.html
│  │                  myinfo.html
│  │
│  └─test
│      └─classes
│          └─com
│              └─example
│                  └─jobKoreaIt
│                      │  JobKoreaItApplicationTests.class
│                      │
│                      ├─controller
│                      │      CommunityControllerTest.class
│                      │
│                      └─domain
│                          └─common
│                              └─repository
│                                      CommunityRepositoryTest.class
│
└─src
    ├─main
    │  ├─generated
    │  ├─java
    │  │  └─com
    │  │      └─example
    │  │          └─jobKoreaIt
    │  │              │  JobKoreaItApplication.java
    │  │              │
    │  │              ├─config
    │  │              │  │  DataSourceConfig.java
    │  │              │  │  MultipartConfig.java
    │  │              │  │  SecurityConfig.java
    │  │              │  │  TxConfig.java
    │  │              │  │  WebMvcConfig.java
    │  │              │  │
    │  │              │  └─auth
    │  │              │      │  PrincipalDetails.java
    │  │              │      │  PrincipalDetailsOAuth2Service.java
    │  │              │      │  PrincipalDetailsService.java
    │  │              │      │
    │  │              │      ├─exceptionHandler
    │  │              │      │      CustomAccessDeniedHandler.java
    │  │              │      │      CustomAuthenticationEntryPoint.java
    │  │              │      │
    │  │              │      ├─jwt
    │  │              │      │      JwtAuthorizationFilter.java
    │  │              │      │      JwtProperties.java
    │  │              │      │      JwtTokenProvider.java
    │  │              │      │      KeyGenerator.java
    │  │              │      │      TokenInfo.java
    │  │              │      │
    │  │              │      ├─loginHandler
    │  │              │      │      CustomAuthenticationFailureHandler.java
    │  │              │      │      CustomLoginSuccessHandler.java
    │  │              │      │      Oauth2JwtLoginSuccessHandler.java
    │  │              │      │
    │  │              │      ├─logoutHandler
    │  │              │      │      CustomLogoutHandler.java
    │  │              │      │      CustomLogoutSuccessHandler.java
    │  │              │      │
    │  │              │      └─provider
    │  │              │              GoogleUserInfo.java
    │  │              │              KakaoUserInfo.java
    │  │              │              NaverUserInfo.java
    │  │              │              OAuth2UserInfo.java
    │  │              │
    │  │              ├─controller
    │  │              │  │  CommunityController.java
    │  │              │  │  HomeController.java
    │  │              │  │
    │  │              │  └─user
    │  │              │      │  UserController.java
    │  │              │      │
    │  │              │      ├─offer
    │  │              │      │      OfferController.java
    │  │              │      │      OfferRestController.java
    │  │              │      │
    │  │              │      └─seeker
    │  │              │              SeekerController.java
    │  │              │              SeekerRestController.java
    │  │              │
    │  │              ├─domain
    │  │              │  ├─common
    │  │              │  │  ├─dto
    │  │              │  │  │      CommunityDto.java
    │  │              │  │  │      Criteria.java
    │  │              │  │  │      PageDto.java
    │  │              │  │  │      UserDto.java
    │  │              │  │  │
    │  │              │  │  ├─entity
    │  │              │  │  │      Community.java
    │  │              │  │  │      Signature.java
    │  │              │  │  │      User.java
    │  │              │  │  │
    │  │              │  │  ├─repository
    │  │              │  │  │      CommunityRepository.java
    │  │              │  │  │      UserRepository.java
    │  │              │  │  │
    │  │              │  │  └─service
    │  │              │  │          CommunityServiceImpl.java
    │  │              │  │          UserService.java
    │  │              │  │          UserServiceImpl.java
    │  │              │  │
    │  │              │  ├─offer
    │  │              │  │  ├─dto
    │  │              │  │  │      CompanyDto.java
    │  │              │  │  │      OfferDto.java
    │  │              │  │  │
    │  │              │  │  ├─entity
    │  │              │  │  │      Company.java
    │  │              │  │  │      JobOffer.java
    │  │              │  │  │
    │  │              │  │  ├─repository
    │  │              │  │  │      CompanyRepository.java
    │  │              │  │  │      JobOfferRepository.java
    │  │              │  │  │
    │  │              │  │  └─service
    │  │              │  │          JobOfferServiceImpl.java
    │  │              │  │
    │  │              │  └─seeker
    │  │              │      ├─dto
    │  │              │      │      SeekerDto.java
    │  │              │      │
    │  │              │      ├─entity
    │  │              │      │      JobSeeker.java
    │  │              │      │      Resume.java
    │  │              │      │
    │  │              │      ├─repository
    │  │              │      │      JobSeekerRepository.java
    │  │              │      │      ResumeRepository.java
    │  │              │      │
    │  │              │      └─service
    │  │              │              JobSeekerServiceImpl.java
    │  │              │
    │  │              └─properties
    │  │                      AUTH.java
    │  │                      DBCONN.java
    │  │                      UPLOADPATH.java
    │  │
    │  └─resources
    │      │  application.properties
    │      │  data.sql
    │      │  schema.sql
    │      │
    │      ├─static
    │      │  ├─assets
    │      │  │      facebookicon.png
    │      │  │      githublogo.png
    │      │  │      instraicon.png
    │      │  │      logo.gif
    │      │  │      logo.png
    │      │  │      logo_2.png
    │      │  │
    │      │  ├─css
    │      │  │  │  common.css
    │      │  │  │  index.css
    │      │  │  │
    │      │  │  ├─community
    │      │  │  │      add.css
    │      │  │  │      index.css
    │      │  │  │      list.css
    │      │  │  │      read.css
    │      │  │  │      update.css
    │      │  │  │
    │      │  │  ├─mobile
    │      │  │  │      common.css
    │      │  │  │
    │      │  │  └─user
    │      │  │          join.css
    │      │  │          login.css
    │      │  │
    │      │  └─js
    │      │      │  common.js
    │      │      │  index.js
    │      │      │
    │      │      ├─community
    │      │      │      add.js
    │      │      │      index.js
    │      │      │      list.js
    │      │      │      read.js
    │      │      │      update.js
    │      │      │
    │      │      └─user
    │      │              join.js
    │      │              login.js
    │      │
    │      └─templates
    │          │  index.html
    │          │  template_mainPage.html
    │          │  template_subPage.html
    │          │
    │          ├─community
    │          │      add.html
    │          │      index.html
    │          │      list.html
    │          │      read.html
    │          │      update.html
    │          │
    │          ├─fragments
    │          │      footer.html
    │          │      link.html
    │          │      nav.html
    │          │      top_header.html
    │          │
    │          ├─offer
    │          │  └─company
    │          │          add.html
    │          │          delete.html
    │          │          list.html
    │          │          read.html
    │          │          update.html
    │          │
    │          ├─seeker
    │          │  │  main.html
    │          │  │
    │          │  └─resume
    │          │          add.html
    │          │          list.html
    │          │          read.html
    │          │          update.html
    │          │
    │          └─user
    │                  join.html
    │                  login.html
    │                  myinfo.html
    │
    └─test
        └─java
            └─com
                └─example
                    └─jobKoreaIt
                        │  JobKoreaItApplicationTests.java
                        │
                        ├─controller
                        │      CommunityControllerTest.java
                        │
                        └─domain
                            └─common
                                └─repository
                                        CommunityRepositoryTest.java
```
