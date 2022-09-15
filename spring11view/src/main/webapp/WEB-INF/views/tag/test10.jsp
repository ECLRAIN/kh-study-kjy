<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>음원 정보 입력</title>
</head>
<body>
<h1>음원 정보 입력</h1>
<!-- 
form은 전송방식(get/post)을 선택할 수 있다
method라는 속성에 값을 설정한다
 -->
<form action="/music/insert">
<input name="music_title" type="" required><br>
<input name="music_artist" type="" required><br>
<input name="" type="" required><br>
<button>등록</button>
</form>
</body>
</html>