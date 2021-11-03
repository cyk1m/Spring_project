package com.mega.mvc05.static1;

public class DayUse {

	public static void main(String[] args) {
		//Day day1 = new Day(); 기본생성자는 없고 입력값없는 Day만 만들어놨기때문에 인식x
		Day day1 = new Day("자바공부", 10, "강남");
		//new day할때마다 +1 해보기
		System.out.println(Day.count); //day1->Day.count. static변수는 클래스이름을 써서 접근하는 것이 일반적.
									   //new를 안 해도 아무때나 꺼내 쓸 수 있다는 것이 장점.
		Day day2 = new Day("여행", 15, "강원도");
		System.out.println(Day.count);
		Day day3 = new Day("운동", 11, "피트니스");
		System.out.println(Day.count);
		//->이렇게 하면 누적이 안되고 각각 1로 찍히는데, 객체마다 동적으로 count 인스턴스 변수가 생겨서 누적이 안 되는 것
		//Day.java에서 count를 static 변수로 만들어주면, 누적이 된다.
		
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
		//시간 누적, 평균 구하기
		System.out.println(Day.sum + "시간"); //36시간
		System.out.println("평균" + (Day.sum/Day.count) + "시간"); //평균12시간
		//static메서드 써보기
		System.out.println(Day.getAvg()); //12
	}

}
//인스턴스 변수는 주소로 접근해야만다 스태틱과 달리.
//Day.count: 클래스 이름으로 cpu가 램에 접근해서(접근연산자) 그 값을 가져오는 것
