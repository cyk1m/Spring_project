package com.mega.mvc06;

public class Problem06 {
//메서드 호출하는 곳마다 에러를 다르게 처리할 때 던진다!
//Problem06Main에서는 에러를 메일로 알릴 것
//Problem06Main2에서는 에러를 문자로 알릴 것 이런 식의 차이
//try-catch는 한번에 처리하고 싶을 때
	public void call() throws Exception{
			System.out.println(3/0);
	}
	
}
