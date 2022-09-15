<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게스트 북</title>
</head>
<body>
<!-- 
	placeholder는 도움말 작성하는 속성
	required는 필수입력 항목을 지정하는 속성
		이름과 값이 같은 속성은 이름만 적어도 효과를 인정
		required,readonly,disabled,checked,selected.. 
 -->
<h1>게스트북 방명록 작성</h1>
<form action="/guest-book/insert">

<input name="name" placeholder="이름">
<input name="memo" placeholder="메모">
<button>등록</button>
</form>
</body>
</html>