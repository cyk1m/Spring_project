<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- model.속성으로 지정한 것은 $로 쓸 수 있다. -->
전체 프린트: ${list}
<hr color="red">
<table border=1>
	<tr bgcolor="yellow" align="center">
		<td width="100">아이디</td>
		<td width="100">제목</td>
		<td width="100">내용</td>
		<td width="100">작성자</td>
		<td width="100">상세페이지로</td>
	</tr>
<c:forEach items="${list}" var="dto">
	<!-- line3에 jstl을 넣어서 자바 문법을 태그로 쓸 수 있다! -->
	<!-- 자바태그는 톰킷이 서버에서 실행, 아닌것은 클라이언트로 -->
	<!-- for-each문에 list를 출력할 때 임시변수 필요했는데 그게 var="dto"임 -->
	<tr bgcolor="lime" align="center">
		<td width="100">${dto.id}</td>
		<td width="100">${dto.title}</td>
		<td width="100">${dto.content}</td>
		<td width="100">${dto.writer}</td>
		<td width="100">
			<a href="one2?id=${dto.id}">
			<!-- controller의 one2로!! -->
				<button>상세페이지로!</button>
			</a>
		</td>
	</tr>
</c:forEach>
</table>
</body>
</html>