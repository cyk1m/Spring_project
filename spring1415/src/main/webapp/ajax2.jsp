<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
$(function() {
	$('#b1').click(function() {
		food1Value = $('#food1').val()	
		food2Value = $('#food2').val()
		//alert(food1Value)
		//alert(food2Value)
		$.ajax({
			url : "b1.jsp",
			data : {
				f1 : food1Value,
				f2 : food2Value
			},
			success: function(result) {
				alert('b1.jsp 호출 성공@@')
				//alert(result)
				$('#d1').append(result + "<br>")
			},
			error: function() {
				alert('b1.jsp 호출 실패@@')
			}
		})
	})//b1 end
	$('#b2').click(function() {
		tempValue = $('#temp').val()	
		dayValue = $('#day').val()
		$.ajax({
			url : "b2.jsp",
			data : {
				temp : tempValue,
				day : dayValue
			},
			success: function(result) {
				alert('b2.jsp 호출 성공@@')
				alert(result)
				$('#d1').append(result + "<br>")
			},
			error: function() {
				alert('b2.jsp 호출 실패@@')
			}
		})
	})//b2 end
})//start$ end
</script>
</head>
<body>
먹고 싶은 음식 : <input id="food1"><br>
먹기 싫은 음식 : <input id="food2"> <button id="b1">결과 출력(b1.jsp)</button><br>
<hr color="blue">
오늘의 온도는 :     <input id="temp"><br>
오늘은 무슨 요일인가? : <input id="day"> <button id="b2">결과 출력(b2.jsp)</button>
<hr color="blue">
<div id="d1"></div>
</body>
</html>