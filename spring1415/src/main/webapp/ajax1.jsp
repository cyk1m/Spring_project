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
		//alert('b1 click')
		wordValue = $('#word').val() //"내가 전송될 스트링!!"
		//alert(word) 값 넘어왔는지 출력해보는 것이 좋다.
		$.ajax({
			url : "test.jsp",
			data : {
				//서버에서 받을 때는 "word"라는 키로 받아야한다.
				//request.getParameter("word");
				word : wordValue //또 있으면 쉼표로 써줌
			},
			success : function(result) {
				//alert('test.jsp 호출 성공!!')
				alert(result)
				$('#d1').append(result + "<br>")
			}, //success end
			error : function() {
				alert('test.jsp 호출 실패!!')
			} //error end
		})//ajax end
	})//b1 end
	
	$('#b2').click(function() {
		alert('b2 click')
		moneyValue = $('#money').val()
		payValue = $('#pay').val() //100000
		//alert(payValue)
		$.ajax({
			url : "money.jsp",
			data : {
				money : moneyValue,
				pay : payValue
			},
			success : function(result) {
				alert('pay.jsp 호출 성공!!')
				alert(result)
				$('#d1').append('당신이 결제할 금액은 ' + result + "<br>")
			}, //success end
			error : function() {
				alert('pay.jsp 호출 실패!!')
			} //error end
		})//ajax end
	})//b2 end

	$('#b3').click(function() {
		//alert('b3 click')
		userValue = $('#user').val() //"apple"
		//alert(userValue)
		$.ajax({
			url : "user.jsp",
			data : {
				user : userValue
			},
			success : function(result) {
				//alert('user.jsp 호출 성공!!')
				alert(result)
				$('#d1').append(result + "<br>")
			}, //success end
			error : function() {
				alert('user.jsp 호출 실패!!')
			} //error end
		})//ajax end
	})//b3 end
	
	$('#b4').click(function() {
		//alert('b4 click')
		telValue = $('#tel').val() //"apple"
		//alert(telValue)
		$.ajax({
			url : "tel.jsp",
			data : {
				tel : telValue
			},
			success : function(result) {
				//alert('tel.jsp 호출 성공!!')
				alert(result)
				$('#d1').append(result + "<br>")
			}, //success end
			error : function() {
				alert('tel.jsp 호출 실패!!')
			} //error end
		})//ajax end
	})//b4 end
	
})//start$ end
</script>
</head>
<body style="background: pink">
<h3>비동기 통신</h3>
<hr>
ajax 테스트: <input id="word"> <button id="b1">ajax 테스트(test.jsp)</button> <br>
결제금액 : <input id="money"><br>
1)계좌이체, 2)신용카드, 3)휴대폰결제<br>
결제수단: <input id="pay"> <button id="b2" style="background: green">결제하기(money.jsp)</button><br>
<hr color="red">
회원가입할 id입력: <input id="user"> <button id="b3" style="background: yellow">회원가입시 id 중복 체크(user.jsp)</button><br>
<hr color="red">
인증받을 전화번호 입력: <input id="tel"> <button id="b4" style="background: olive">인증번호 받기(tel.jsp)</button><br>
<hr color="green">
<div id="d1"></div>
</body>
</html>