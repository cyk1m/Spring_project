<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	body{
		font-size: 20px;	
	}
	button:hover{
		background: pink;
	}
</style>
<script type="text/javascript" src="resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
$(function() {
		$('#check').click(function() {
			uid = $('#user').val()
			if (uid.length >= 5) {
				$('#result').text('유효한 id')
				$('#result').css({'background':'yellow', 'color':'blue'})
			} else {
				$('#result').text('유효하지 않은 id')
				$('#result').css({'background':'red', 'color':'white'})
			}
		})
		
		//text, html은 글자를 덮어쓰는데 append는 누적!
		$('#check2').click(function() {
			p1 = $('#pw1').val()
			p2 = $('#pw2').val()
			if (p1 == p2) {
				$('#result').append('동일한 패스워드<br>')
			} else {
				$('#pw1').val('')
				$('#pw2').val('')
				$('#result').append('동일하지 않은 pw<br>')
			}
		})
})
</script>
</head>
<body>
아이디 입력 : <input id="user"> <button id="check">아이디 유효성 검사</button><br>
<!-- result에 프린트: d글자수가 5글자 이상이면 유효한 id/아니면 유효하지 않은 id -->
<hr>
비밀번호1 : <input id="pw1"> <br>
비밀번호2 : <input id="pw2"> <button id="check2">암호 유효성 검사</button><br>
<!-- result에 프린트: pw1, pw2의 값이 동일하면 동일한 pw/아니면 동일x pw
	 동일하지 않은 경우 pw1, pw2의 값을 clear -->
<hr>
<div id="result" style="background: yellow"></div>
</body>
</html>