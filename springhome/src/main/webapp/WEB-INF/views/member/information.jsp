<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/WEB-INF/views/template/header.jsp">
	<jsp:param value="개인정보 변경" name="title"/>
</jsp:include>

<div align="center">

<h1>개인정보 변경</h1>

<form action="information" method="post">
	<input type="text" value="memberNick" value="${memberDto.memberNick}">
	<br>
	<button type="submit">변경하기</button>
</form>
	
</div>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>