package com.mega.mvc05.static1;

public class Clerk {
	String name;
	String gender;
	int age;
	static int count;
	static int sum;
	
	public Clerk(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		count++;
		sum += age;
	}

	@Override
	public String toString() {
		return "Clerk [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
}
