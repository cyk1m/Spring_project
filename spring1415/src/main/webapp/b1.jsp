<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
    
    String f1 = request.getParameter("f1");
    String f2 = request.getParameter("f2");
    String result = "오늘은 " + f1 + "을(를) 먹고, 내일은 " + f2 + "을(를) 먹겠어!";
    %><%= result %>