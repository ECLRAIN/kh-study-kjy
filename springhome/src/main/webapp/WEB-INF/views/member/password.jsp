<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp">
	<jsp:param value="비밀번호 변경" name="title"/>
</jsp:include>
<h1>비밀번호 변경</h1>
<form action="password" method="post">
<input type="password" name="memberPw" placeholder="변경할 비밀번호">
<button>변경</button>
</form>