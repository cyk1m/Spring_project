package com.mega.mvc08.casting;

public class MathTest {

	public static void main(String[] args) {
		double data = -3.12345;
		System.out.println(Math.abs(data)); //절대값
		System.out.println(Math.ceil(data)); //올리는 것
		System.out.println(Math.floor(data)); //내리는 것
		System.out.println(Math.round(data)); //반올림
		
		System.out.println(Math.random()); //0~..<1
		System.out.println(Math.random() + 10); //10~..<11
	}

}
