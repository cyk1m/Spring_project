package com.mega.mvc07.test;

public class SingleUser {

	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++) { //1000개의 객체 만들어짐
			SingleObject single1 = new SingleObject();
		}
		
//		SingleObject single2 = new SingleObject();
		System.out.println(SingleObject.count + "개");
		System.out.println(SingleObject.count * 8 + 4 + "byte"); //참조형8+count(int)4
	}

}
