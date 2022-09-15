<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<jsp:include page="/WEB-INF/views/template/header.jsp">
	<jsp:param value="음원 상세정보" name="title"/>
</jsp:include>


<div align="center">
	<h1>음원 상세정보</h1>
	<table border="1" width="400">
		<tbody>
			<tr>
				<th width="25%">번호</th>
				<td>${musicDto.musicNo}</td>
			</tr>
			<tr>
				<th width="25%">제목</th>
				<td>${musicDto.musicTitle}</td>
			</tr>
			<tr>
				<th width="25%">가수</th>
				<td>${musicDto.musicArtist}</td>
			</tr>
			<tr>
				<th width="25%">앨범</th>
				<td>${musicDto.musicAlbum}</td>
			</tr>
			<tr>
				<th width="25%">재생수</th>
				<td>${musicDto.musicPlay}</td>
			</tr>
			<tr>
				<th width="25%">발매일</th>
<%-- 			<td>${musicDto.releaseTime}</td> --%>
				<td>
					<fmt:formatDate value="${musicDto.releaseTime}" pattern="y년 M월 d일 E요일"/>
				</td>
			</tr>
		</tbody>
	</table>
	
	<h2><a href="list">목록보기</a></h2>
	<h2><a href="edit?musicNo=${musicDto.musicNo}">수정하기</a></h2>
	<h2><a href="delete?musicNo=${musicDto.musicNo}">삭제하기</a></h2>
	
</div>


<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>

