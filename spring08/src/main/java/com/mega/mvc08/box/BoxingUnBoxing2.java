package com.mega.mvc08.box;

public class BoxingUnBoxing2 {

	public static void main(String[] args) {
		//원래는 참조형 변수에 들어있는 주소를 기본형 변수에 넣을 수 없다.
		//=>자바는 변수가 선언될 때 변수에 들어가는 타입이 결정되기 때문에 그거 이외에는 넣을 수 없어서.
		//"기본형과 기본형에 대한 포장클래스간만 가능!"
		Integer i1 = new Integer(0); //참조형. i1에 주소값
		int i2 = 0; //기본형 정수
		int i3 = 0;
		//참조형변수에 기본형 값을 넣는 것
		//기본형변수에 참조형 값을 넣는 것도 가능
		i1 = i2; //참조형(객체)<--auto박싱--기본형
		i3 = i1; //기본형<--auto언박싱(포장을 풀어 작게, 기본형으로)--참조형(객체)
	}

}
