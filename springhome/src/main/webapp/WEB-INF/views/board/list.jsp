<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp">
	<jsp:param value="글 리스트" name="title"/>
</jsp:include>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<div align="center">

<h1>글 목록</h1>

<form action="list" method="get">
<select name="type" required>
			<!-- 
				보여지는 글자와 전송할 글자를 분리하여 작성
				value - 전송되는 값 
			-->
			<option value="board_title">제목</option>
			<option value="board_writer">글쓴이</option>
			
		</select>
		<!-- 키워드 -->
		<input type="search" name="keyword" placeholder="검색어" required>
		
		<button>검색</button>
		
	</form>
	
<table border="1">
	<tr>
		<th>번호</th>
		<th>작성자</th>
		<th>제목</th>
		<th>작성 날짜</th>
		<th>조회수</th>
		<th>카테고리</th>
	</tr>
	<c:forEach var="dto" items="${list}">
	<tr>
		<td>${dto.boardNo}</td>
		<td>sd</td>
		<td>${dto.boardTitle}</td>
		<td>${dto.boardWriteTime}</td>
		<td>${dto.boardRead}</td>
		<td>${dto.boardHead}</td>
	</tr>
	</c:forEach>
</table>

</div>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>
