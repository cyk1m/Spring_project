package com.mega.mvc07.test;

public class One2 {
	//싱글톤용 클래스로 정의해주세요.
	static One2 object; //null
	private One2() {
		System.out.println("One2 객체 생성됨@@@@");
	}
	
	public static One2 getInstance() {
		if (object == null) {
			object = new One2();
		} else {
		}
		return object;
	}
	
}
