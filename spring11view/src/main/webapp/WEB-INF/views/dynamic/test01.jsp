<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 
jsp에서는 java코드를 사용할 수 있다
<% %>로 구간을 만들고 코드를 작성하는데 이를 scriptlet이라고 부른다
<%= %> 로 변수명을 감싸면 출력이 되면이를 표현식이라고 부른다
자바코드를 다 쓸 수 있다
--%>

<%for(int i=0; i<10; i++){%>
<h1>hi</h1>
<%}%>