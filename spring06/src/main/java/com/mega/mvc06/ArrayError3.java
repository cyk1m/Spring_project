package com.mega.mvc06;

public class ArrayError3 {
	
	// 1. array() 메서드 내에서 try-catch 예외처리
//	public static void main(String[] args) {
//		ArrayError2 error = new ArrayError2();
//		error.array();
//	}
	
	// 2. 호출한 곳에서 예외처리
	public static void main(String[] args) {
		ArrayError2 error = new ArrayError2();
		try {
			error.array();
		} catch (Exception e) {
			System.out.println("에러발생@@@@");
		}
	}

}
