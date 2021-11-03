package com.mega.mvc07.test;

//static문제
public class Girl {
	String name;
	int age;
	//2.소녀객체가 만들어졌을 때 나이를 누적할 수 있는 static변수를 만들어서 누적처리를 하세요.
	static int sum;
	//3.소녀객체가 만들어졌을 때 인원을 누적할 수 있는 static변수를 만들어서 누적처리
	static int count;
	
	public Girl(String name, int age) {
		this.name = name;
		this.age = age;
		count++;
		sum += age;
	}
	@Override
	public String toString() {
		return "Girl [name=" + name + ", age=" + age + "]";
	}
	
}
