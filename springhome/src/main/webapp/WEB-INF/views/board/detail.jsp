<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<jsp:include page="/WEB-INF/views/template/header.jsp">
	<jsp:param value="자유 게시판" name="title"/>
</jsp:include>

<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script>
	$(function(){
		//목표 : 
		//1. edit-btn을 누르면 view를 숨기고 editor를 보여준다
		//2. cancel-btn을 누르면 editor를 숨기고 view를 보여준다
		//3. 처음에는 view만 보여준다
		//1
		$(".edit-btn").click(function(){
			$(this).parents(".view").hide();
			$(this).parents(".view").next(".editor").show();
		});
		//2
		$(".cancel-btn").click(function(){
			$(this).parents(".editor").hide();
			$(this).parents(".editor").prev(".view").show();
		});
		//3
		$(".editor").hide();
	});
</script>

<h1>게시글 보기</h1>

<table border="1" width="500">
	<tbody>
		<tr>
			<th width="25%">번호</th>
			<td>${boardDto.boardNo}</td>
		</tr>
		<tr>
			<th>말머리</th>
			<td>${boardDto.boardHead}</td>
		</tr>
		<tr>
			<th>제목</th>
			<td>${boardDto.boardTitle}</td>
		</tr>
		<tr>
			<th>작성자</th>
			<td>${boardDto.boardWriter}</td>
		</tr>
		<tr height="200" valign="top">
			<th>내용</th>
			<td>
				<!-- pre 태그는 엔터, 띄어쓰기, 탭키 등을 있는 그대로 표시하는 영역 -->
				<pre>${boardDto.boardContent}</pre>
			</td>
		</tr>
		<tr>
			<th>조회수</th>
			<td>${boardDto.boardRead}</td>
		</tr>
		<tr>
			<th>작성일</th>
			<td>
				<fmt:formatDate value="${boardDto.boardWritetime}" pattern="y년 M월 d일 E요일 a h시 m분 s초"/>
			</td>
		</tr>
		<c:if test="${boardDto.boardUpdatetime != null}">
		<tr>
			<th>수정일</th>
			<td>
				<fmt:formatDate value="${boardDto.boardUpdatetime}" pattern="y년 M월 d일 E요일 a h시 m분 s초"/>
			</td>
		</tr>
		</c:if>
	</tbody>
	<tfoot>
		<tr>
			<td colspan="2" align="right">
				
				<c:if test="${loginId != null}">
				<a href="write">글쓰기</a>
				<a href="write?boardParent=${boardDto.boardNo}">답글쓰기</a>
				</c:if>
				
				<%--
					관리자는 삭제만, 회원은 자신의 글만 수정/삭제 가능하도록 처리
				 --%>
				<c:set var="owner" value="${loginId == boardDto.boardWriter}"></c:set>
				<c:set var="admin" value="${mg == '관리자'}"></c:set>
				
				<c:if test="${owner}">
				<a href="edit?boardNo=${boardDto.boardNo}">수정하기</a>
				<a href="delete?boardNo=${boardDto.boardNo}">삭제하기</a>
				</c:if>
				
				<c:if test="${admin}">
				<a href="delete?boardNo=${boardDto.boardNo}">삭제하기</a>
				</c:if>
				
				<a href="list">목록으로</a>
			</td>
		</tr>
	</tfoot>
</table>

<br>

<table border="1" width="500">
	<!-- 댓글 목록 -->
	<tbody>
		<c:forEach var="replyDto" items="${replyList}">
		
		<!-- 사용자에게 보여주는 화면 -->
		<tr class="view">
			<td width="90%">
				<!-- 작성자 -->
				${replyDto.replyWriter}
				<c:if test="${boardDto.boardWriter ==  replyDto.replyWriter}">
				(작성자)
				</c:if>
				
				(등급) 
				<br>
				<pre>${replyDto.replyContent}</pre>
				<br><br>
				<fmt:formatDate value="${replyDto.replyWritetime}" 
											pattern="yyyy-MM-dd HH:mm"/>
			</td>
			<th>
				<!-- 수정과 삭제는 현재 사용자가 남긴 댓글에만 표시 -->
				<c:if test="${loginId == replyDto.replyWriter}">
					<a class="edit-btn">수정</a>
					<br>
					<a href="reply/delete?replyNo=${replyDto.replyNo}&replyOrigin=${replyDto.replyOrigin}">삭제</a>
				</c:if>
				
				<c:if test="${admin}">
					<a href="#">블라인드</a>
				</c:if>
			</th>
		</tr>
		
		<c:if test="${loginId ==  replyDto.replyWriter}">
		<!-- 수정하기 위한 화면 : 댓글 작성자 본인에게만 출력 -->
		<tr class="editor">
			<th colspan="2">
				<form action="reply/edit" method="post">
					<input type="hidden" name="replyNo" 
												value="${replyDto.replyNo}">
					<input type="hidden" name="replyOrigin"
												value="${replyDto.replyOrigin}">
					<textarea name="replyContent" rows="5" cols="50" 
							required>${replyDto.replyContent}</textarea>
					<button type="submit">변경</button>
					<a class="cancel-btn">취소</a>
				</form>
			</th>
		</tr>
		</c:if>
		
		</c:forEach>
	</tbody>
</table>
<br>

<%-- 회원일 경우와 아닐 경우 댓글 작성창이 다르게 보이도록 처리 --%>
<c:choose>
	<c:when test="${loginId != null}">
		<!-- 댓글 작성 -->
		<form action="reply/write" method="post">
		<input type="hidden" name="replyOrigin" value="${boardDto.boardNo}">
		<table width="500">
			<tbody>
				<tr>
					<th>
						<textarea name="replyContent" rows="5" cols="55" 
										placeholder="댓글 작성.." required></textarea>
					</th>
					<th>
						<button type="submit">등록</button>
					</th>
				</tr>
			</tbody>
		</table>
		</form>
	</c:when>
	<c:otherwise>
		<table width="500">
			<tbody>
				<tr>
					<th>
						<textarea name="replyContent" rows="5" cols="55" 
							placeholder="로그인 후 댓글 작성이 가능합니다" disabled></textarea>
					</th>
					<th>
						<button type="submit" disabled>등록</button>
					</th>
				</tr>
			</tbody>
		</table>
	</c:otherwise>
</c:choose>


<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>




