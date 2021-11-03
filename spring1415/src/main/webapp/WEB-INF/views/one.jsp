<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="lime">
<h1>검색된 회원 정보입니다.</h1>
<hr>
<!-- dto.getId() -->
<!-- jsp는 $ mapper에서는 # -->
검색된 id: ${bag.id} <br>
검색된 pw: ${bag.pw} <br>
검색된 name: ${bag.name} <br>
검색된 tel: ${bag.tel} <br>
</body>
</html>