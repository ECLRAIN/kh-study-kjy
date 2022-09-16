<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp">
	<jsp:param value="글 작성" name="title"/>
</jsp:include>
<div align="center">
<h1>글 작성하기</h1>
	<form action="write" method="post">
	작성자 : <input name="boardWiter" type="text" required><br>
	제목 : <input name="boardTitle" type="text" required><br>
	내용 : <input name="boardContent" type="text" required><br>
	카테고리 : <input name="boardHead" type="text" required><br>
	<button>작성</button>
	</form>
	내가 입력받을거만 위에 적어 4개 
</div>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>
