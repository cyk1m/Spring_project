<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="index.jsp">to start page..</a>
<hr>
<!-- in.mega가 없는 주소라서 컨트롤러에 가서 찾는다. requestMapping에 in.mega인거 찾아서 무조건 실행  -->
<!-- mega 안 써도 됨. 뒤에 회사 이름 쓰는 게 멋지니까 씀.  -->
<form action="bbs">
번호: <input name="bNo"><br>
제목: <input name="title"><br>
내용: <input name="content"><br>
작성자: <input name="writer"><br>
날짜: <input type="date" name="date"><br>
<button>글 작성 완료</button>
</form>
<a href="bbs">이렇게 써도 요청은 되지만 파라메터는 안 감</a><br>
<a href="bbs?bNo=100&title=test&content=test&writer=test&date=20210827">게시판 신청완료2 (이거랑 form action이랑 같은 요청)</a>
</body>
</html>