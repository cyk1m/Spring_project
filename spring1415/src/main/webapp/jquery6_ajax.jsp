<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	button:hover {
		background: yellow
	}
</style>
<script type="text/javascript" src="resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
$(function() {
	//ajax를 실행해라. {key-value} 형태
	//자바에서 키:값의 자료구조는 map이라고 한다.
	//자바스크립트에서는 JSON: JavaScript Object Notation(js에서 대상을 표기하는 방법)
	//$.ajax({url:"....", data: ..., success:..., error:...})
	//$.ajax(JSON 타입의 입력값)
	$('#b1').click(function() {
		$.ajax({
			url : "ios.jsp", //비동기로 호출할 것
			//data : {},
			success : function(doc) { //호출한 결과를 받아오고 싶으면 변수 넣어주기 //처리할게 많으므로 익명함수를 value로
				alert('성공!!!!')
				alert(doc) 
				$('#result').append('<font color="red">' + doc + '</font><br>')
			},
			error : function() {
				alert('실패!!!!')
			}
		})	
	})//b1
	
	$('#b2').click(function() {
		$.ajax({
			url : "a.jsp",
			success : function(x) {
				alert('성공@@@@')
				alert(x)
				$('#result').append('<font color="orange">' + x + '</font><br>')
			},
			error : function() {
				alert('실패@@@@')
			}
		})
	})
	$('#b3').click(function() {
		$.ajax({
			url : "b.jsp",
			success : function(x) {
				alert('성공@@@@')
				alert(x)
				$('#result').append('<font color="green">' + x + '</font><br>')
			},
			error : function() {
				alert('실패@@@@')
			}
		})
	})
	
})
</script>
</head>
<body>
<button id="b1">AJax Test</button><br>
<button id="b2">AJax Test2</button><br>
<button id="b3">AJax Test3</button><br>
ajax실행결과는: <div id='result'></div>
</body>
</html>