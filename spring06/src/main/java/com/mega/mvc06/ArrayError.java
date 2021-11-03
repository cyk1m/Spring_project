package com.mega.mvc06;

public class ArrayError {

	public static void main(String[] args) {
		int[] num = {1,2,3};
		try {
			num[3] = 4; //런타임에러
		} catch (IndexOutOfBoundsException e) {
			// 1. 배열의 IndexOutOfBoundsException이면 "인덱스 에러!!!"라고 출력
			System.out.println("인덱스 에러!!!");
		} catch (Exception e) {
			// 2. 다른 에러이면 "다른 에러 발생@@@"이라고 출력
			System.out.println("다른 에러 발생@@@");
		} finally {
			// 3. 에러가 발생하든 안하든 상관없이 "배열에 문제가 사라지게 해결했어요"를 출력
			System.out.println("배열에 문제가 사라지게 해결했어요~~~");
		}
		System.out.println("아 배열 끝~~~");
	}

}
