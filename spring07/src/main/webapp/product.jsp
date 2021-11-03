<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>상품 정보 입력 페이지</h3>
<hr color="blue">
<form action="insert.do">
상품 번호: <input name="pNo"><br>
상품명: <input name="name"><br>
상세 정보: <input name="content"><br>
날짜: <input type="date" name="date"><br>
<button>상품 등록 완료</button>
</form>
</body>
</html>