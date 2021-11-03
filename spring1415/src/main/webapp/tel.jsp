<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><% 
   
	String tel = request.getParameter("tel");
	//c.f.substring(3)은 인덱스 3~끝까지
	//한글자 가져오기: char c = tel.charAt(3); 3번 인덱스 글자(0부터시작)
	String phone = tel.substring(0,3);
	String result = "";
    if(phone.equals("010")) {
		result = "111";		
	} else if(phone.equals("011")){
		result = "222";		
	}else{
		result = "333";
	}
    Random r = new Random();
    //int num2 = r.nextInt(100); //0~99
    //int num2 = r.nextInt(100) + 100; //100~199
    int num2 = r.nextInt(900) + 100; //100~999
    result = result + num2;
%><%= result %>