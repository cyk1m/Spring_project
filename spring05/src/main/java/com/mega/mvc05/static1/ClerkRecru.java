package com.mega.mvc05.static1;

public class ClerkRecru {

	public static void main(String[] args) {
		Clerk c1 = new Clerk("홍길동", "남", 25);
		Clerk c2 = new Clerk("김길동", "여", 26);
		Clerk c3 = new Clerk("송길동", "남", 27);
		//1.모든 직원의 정보
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		//2.직원의 수
		System.out.println("직원의 수 " + Clerk.count + "명");
		//3.나이 평균
		System.out.println("평균 " + (Clerk.sum/Clerk.count) + "세");
	}

}
