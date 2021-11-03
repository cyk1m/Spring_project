package com.mega.mvc07.test;

public class MyGirlsMain {
	//static문제
	public static void main(String[] args) {
		Girl girl1 = new Girl("길순", 13);
		Girl girl2 = new Girl("길숙", 10);
		//1.전체 소녀들의 정보를 프린트
		System.out.println(girl1);
		System.out.println(girl2);
		////4.전체 소녀수와 나이의 평균을 구하세요.
		System.out.println("전체 소녀 수 " + Girl.count + "명");
		System.out.println("소녀들 나이의 평균 " + Girl.sum/Girl.count + "세"); //나이 평균
	}

}
