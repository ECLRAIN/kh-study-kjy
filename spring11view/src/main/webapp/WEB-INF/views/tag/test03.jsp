<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 
img 태그 이미를 표시하기 위한 태그
종료 태그가 없음
src img 으로 시작함
남이 가진 이미지는 안전하지 않음
스프링 부트에서는 static 폴더가 정적 자원 저장 위치이다

width height라는 속성으로 크기 조절이 가능하다
width만 설정하면 height는 비율에 맞게 자동 조정된다
-->

<img src="http://localhost:8888/image/img1.jpg" width="200">
<br>
<!-- 절대 경로-->
<img src="/image/img1.jpg" width="200">
<br>

<!-- 상대 경로-->
<img src="../image/img1.jpg" width="200">
<!-- 
alt 속성은 이미지가 없을 때 나올 글자이기도 하지만
시각장애인 리더기가 읽는 글자 역할을 한다
접근성을 높이기 위해서 사용하며 최대한 자세히 쓰는 것을 권유
-->
<img alt="데스티니 배경화면" src="/image/img1.jpg" width="200">
</body>
</html>