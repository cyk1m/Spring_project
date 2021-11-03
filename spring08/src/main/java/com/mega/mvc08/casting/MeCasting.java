package com.mega.mvc08.casting;

import java.util.ArrayList;

public class MeCasting {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1000);
		list.add(189.1);
		list.add(false);
		list.add('남');
		//1.전체목록을 프린트
		System.out.println("전체목록: " + list);
		//2.돈 1000을 꺼내서 2000을 더해 프린트
		int money = (Integer)list.get(0); //6. int<--오토언박싱--Integer(작)<--다운캐스팅--Object(큰)
		System.out.println(money + 2000);
		//3.키 189.1을 꺼내서 10을 더해 프린트
		double tall = (Double)list.get(1); //6. double<--오토언박싱--Double(작)<--다운캐스팅--Object(큰)
		System.out.println(tall + 10);
		//4.아침여부 false를 꺼내서 아침을 먹었으면 배불러요, 아니면 배고파요.
		boolean food = (Boolean)list.get(2);
		if (food) {
			System.out.println("배불러요.");
		} else {
			System.out.println("배고파요.");
		}
		//5.성별 남 꺼내서 남이면 주민번호는 1,3이에요, 아니면 2,4예요
		char gender = (Character)list.get(3);
		if (gender == '남') { //기본형(char)은 ==
			System.out.println("주민번호는 1,3이에요.");
		} else {
			System.out.println("주민번호는 2,4예요.");
		}
		//6.2~3에서 형변환(업캐스팅, 다운캐스팅), 오토박싱, 오토언박싱 과정을 순서대로 작성
		
	}

}
