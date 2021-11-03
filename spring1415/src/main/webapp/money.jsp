<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><% 
	int money = Integer.parseInt(request.getParameter("money"));
	int pay = Integer.parseInt(request.getParameter("pay"));
	double money2 = 0;
	if(pay == 1){
		money2 = money * 0.8;
	}else if(pay == 2){
		money2 = money * 0.9;
	}else{
		money2 = money;
	}
%><%= (int)money2 %>