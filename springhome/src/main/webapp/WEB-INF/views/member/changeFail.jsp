<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/WEB-INF/views/template/adminHeader.jsp">
	<jsp:param value="회원 오류" name="title"/>
</jsp:include>

<div align="center">
	<h1>존재하지 않는 회원입니다</h1>
	<h2><a href="list">목록 보기</a></h2>
</div>
	
<jsp:include page="/WEB-INF/views/template/adminFooter.jsp"></jsp:include>