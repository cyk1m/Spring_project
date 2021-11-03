<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/css/out.css">
</head>
<body>
<body bgcolor="pink">
	Welcome!! Member page!!
	<hr>
	<img src="resources/img/slide03.jpg">
<form action="bbs.mega">
	id: <input name="id"><br>
	title: <input name="title"><br>
	content: <input name="content"><br>
	writer: <input name="writer"><br>
	<button>게시판 글 작성 요청</button>
</form>
	<hr>
<form action="bbs2.mega">
	id: <input name="id"><br>
	<button>게시판 글 검색 요청</button>
</form>
	<hr>
<a href="bbsall.mega">게시판 글 전체 검색 요청</a>
</body>


</html>