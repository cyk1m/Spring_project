package com.mega.mvc05.static1;

public class Day {
	
	//멤버변수, 전역변수, 자동초기화
	//new할때마다 동적으로 복사됨
	String doing; //null
	int time; //0
	String location; //null
	//객체생성과 상관없이 클래스에 1개만 갖고있으면서 생성된 여러개의 객체들이 공유할 목적으로 만든 변수.
	static int count; //0 //static으로 하면 new 해도 복사가 되지 않음. 1개만 존재!!
	static int sum; //0
	
	//생성자 메서드
	public Day(String doing, int time, String location) {
		this.doing = doing; //this: Day클래스
		this.time = time;
		this.location = location;
		//new day할때마다 카운트
		count++;
		sum += time;
	}
	
	//static메서드는 객체 생성하지 않아도 아무 때나 클래스 이름으로 접근해서 그 기능을 처리하게 할 수 있다.
	//자주쓰는 기능은 static 메서드로 만들어 놓으면 아무 때나 쓸 수 있어서 편하다!
	public static int getAvg() { 
		return sum/count;
	}

	//+)객체를  생성하지 않으면 일반 인스턴스 변수에는 접근 불가
	//public static String getAvg2() {
			//static 메서드 안에는 static 변수만 사용 가능!!! 인스턴스 변수 사용 불가능!!!
			//인스턴스 변수객체 생성 후 접근가능하기 때문
			//static메서드는 객체 생성하지 않아도 접근해서 처리를 해야함. doing은 그게 안 되기 때문에 에러
		//return doing;
	//}
	
	//전송용 아니라서 getter setter 안 넣어도 된다
	
	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
	
	
	
}
