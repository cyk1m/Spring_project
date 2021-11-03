<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
$(function() { //mvc2 방식

	$('#b3').click(function() {
		//alert('b3 click')
		userValue = $('#user').val() //"apple"
		//alert(userValue)
		$.ajax({
			url : "check2.mega",
			data : {
				id : userValue, //dto에 있는 변수로 키를 넣어야
				test : $('#test').val()
			},
			success : function(result) { //url이 가상주소일 때 result는 views의 결과
				//alert('user.jsp 호출 성공!!')
				alert(result)
				$('#d1').append(result + "<br>")
			}, //success end
			error : function() {
				alert('check2.mega 호출 실패!!')
			} //error end
		})//ajax end
	})//b3 end

})//start$ end
</script>
</head>
<body style="background: pink">
<!-- views로 스크립트릿 값전달 테스트 -->
<input type="hidden" id="test" value="test">

회원가입할 id입력: <input id="user"> 
<button id="b3" style="background: yellow">회원가입시 id 중복 체크(user.jsp)</button><br>
<hr color="green">
<div id="d1"></div>
</body>
</html>