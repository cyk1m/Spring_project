<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
    double temp = Double.parseDouble(request.getParameter("temp"));
    String day = request.getParameter("day");
    String result = "가을이군!";
    if(temp > 30){
    	result = "엄청 덥군!";
    }
    %><%= "오늘은 " + day + "인데, " + result %>