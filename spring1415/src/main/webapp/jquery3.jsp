<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- jQuery 끼우기 -->
<script type="text/javascript" src="resources/js/jquery-3.6.0.js"></script>
<!-- 실행할 스크립트 -->
<script type="text/javascript">
//body 부분을 먼저 ram에 읽어들여라.
// $(function() { //=document.ready()
// }) 

	//버튼을 클릭했을 때 n1과 n2의 값을 가지고 오자.
	$(function() {
		$('#b1').click(function() {
			//alert('test1---!!!')
			n1Value = $('#n1').val()
			n2Value = $('#n2').val()
			n1 = parseInt(n1Value)
			n2 = parseInt(n2Value)
			alert(n1 + n2)
		})
		$('#b2').click(function() {
			//alert('test2---!!!')
			n1Value = $('#n1').val()
			n2Value = $('#n2').val()
			n1 = parseInt(n1Value)
			n2 = parseInt(n2Value)
			alert(n1 - n2)
		})
		$('#b3').click(function() {
			//alert('test3---!!!')
			n1Value = $('#n1').val()
			n2Value = $('#n2').val()
			n1 = parseInt(n1Value)
			n2 = parseInt(n2Value)
			alert(n1 * n2)
		})
		$('#b4').click(function() {
			//alert('test4---!!!')
			n1Value = $('#n1').val()
			n2Value = $('#n2').val()
			n1 = parseInt(n1Value)
			n2 = parseInt(n2Value)
			alert(n1 / n2)
		})
	})
	
</script>
</head>
<body>
숫자1 : <input id="n1"> <br>
숫자2 : <input id="n2"> <br>
<button id="b1">더하기</button>
<button id="b2">빼기</button>
<button id="b3">곱하기</button>
<button id="b4">나누기</button>
</body>
</html>