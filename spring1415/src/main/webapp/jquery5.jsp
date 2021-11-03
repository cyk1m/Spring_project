<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	button:hover {
		background: blue;
		color: white;
	}
</style>
<script type="text/javascript" src="resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
	$(function() {
		$('#b1').click(function() {
			word2 = $('#word').val()
			$('#result').append('-' + word2 + '<br>')
		})
		$('#b2').click(function() {
			//유지보수면에서 태그를 직접 넣는 것보다 변수 따로 넣는 것이 좋다.
			img = '<img src="resources/img/cake.jpg" width="200" height="100">'
			$('#result').append(img + '<br>')
		})
		$('#b3').click(function() {
			word2 = $('#word').val()
			img = '<img src="resources/img/cake.jpg" width="20" height="20">'
			$('#result').append(img + ' ' + word2 + '<br>')
		})

	})
</script>
</head>
<body>
	댓글:
	<input id="word">
	<button id="b1">댓글 추가</button>
	<br>
	<button id="b2">이미지 추가</button>
	<button id="b3">댓글+이미지 추가</button>
	<hr color="red">
	<div id="result" style="background: yellow"></div>
</body>
</html>