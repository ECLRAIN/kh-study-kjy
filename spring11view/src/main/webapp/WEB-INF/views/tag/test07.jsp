<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>입력 화면</title>
</head>
<body>
<!-- 
입력창은 input 태그로 만든다 종료태그는 없다
button 태그로 만든다
폼 태그로 두 개를 한 뭉탱이로 묶을 수 있다
input에 name을 부여하여 전송 시의 파라미터 명을 지정할 수 있다
action 속성으로 전송될 목적지를 설정할 수 있다
 -->
 <form action="http://www.genie.co.kr/">
 <input name="query">
 <button>검색</button>
 </form>
</body>
</html>