<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="olive">
상품 정보 확인
<hr color="blue">
상품 번호: ${productDTO.pNo} <br>
상품명: ${productDTO.name} <br>
상세 정보: ${productDTO.content} <br>
날짜: ${productDTO.date} <br>
</body>
</html>