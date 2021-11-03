<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><% 
    
	String user = request.getParameter("user");
    String[] list = {"root", "summer", "park"}; //db에 있다 치기
    String result = "중복된 아이디가 없습니다. 가입 가능합니다.";
    //반복문을 돌려서 하나씩 꺼내온다.
    //꺼내와서 내가 입력한 user에 들어있는 값과 동일한지 체크
    //동일하다면 result = "중복된 아이디입니다. 가입 불가능합니다."
//     for(int i = 0; i < list.length; i++){
//     	if(list[i].equals(user)){
//     		result = "중복된 아이디입니다. 가입 불가능합니다.";
//     	}
//     }
    for(String data: list){
    	if(data.equals(user)){
    		result = "중복된 아이디입니다. 가입 불가능합니다.";
    	}
    }
%><%= result %>