package com.mega.mvc06;

public class ArrayError2 {

	// 1. array() 메서드 내에서 try-catch 예외처리
//	public void array() {
//		int[] num = { 1, 2, 3 };
//		try {
//			num[3] = 4; // 런타임에러
//		} catch (Exception e) {
//			System.out.println("내가 예외처리 다 함...!!!");
//		}
//		System.out.println("아 배열 끝~~~");
//	}

	// 2. 메서드 말고 호출한 곳에서 예외처리
	public void array() throws Exception{ //호출하는 곳에 떠넘기기
		int[] num = { 1, 2, 3 };
		num[3] = 4; // 런타임에러
		System.out.println("아 배열 끝~~~");
	}
}
