<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
		//webbapp의 jsp간의 값전달은 스크립트릿으로 해도 ok
		String word = request.getParameter("word");
		System.out.println(word);
	%>공백을 인식하므로 지워준다/당신이 받은 말은 <%= word %>