package com.mega.mvc08.generic;

public class CarUse {

	public static void main(String[] args) {
		Car<String> car1 = new Car<String>();
		Car<Integer> car2 = new Car<>();
		car1.size = "big";
		car2.size = 100; //타입을 마음대로 쓸 수 있다
		
		System.out.println(car1);
		System.out.println(car2);
		
	}

}
