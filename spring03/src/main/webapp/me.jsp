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
in.mega가 없는 주소라서 컨트롤러에 가서 찾는다. requestMapping에 in.mega인거 찾아서 무조건 실행
<form action="in.mega">
아이디: <input name="id"><br>
패스워드: <input name="pw"><br>
이름: <input name="name"><br>
전화번호: <input name="tel"><br>
<button>회원가입 신청 완료</button>
</form>
</body>
</html>