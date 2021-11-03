<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<body bgcolor="pink">
	Welcome!! Hotel page!!
	<hr>
<form action="hotel.fly">
	사업자번호: <input name="hid"><br>
	호텔명: <input name="hname"><br>
	주소: <input name="hregion"><br>
	이미지: <input name="himage"><br>
	입실일자: <input name="checkin"><br>
	퇴실일자: <input name="checkout"><br>
	투숙인원: <input name="guestnum"><br>
	객실종류: <input name="roomsort"><br>
	스탠다드 가격: <input name="stdprice"><br>
	스탠다드 객실수: <input name="stdnum"><br>
	<button>호텔정보 작성 요청</button>
</form>
	<hr>
<form action="hotel2.fly">
	사업자번호: <input name="hid"><br>
	<button>호텔정보 검색 요청</button>
</form>
</body>
</html>