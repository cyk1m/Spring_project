package com.mega.mvc07.test;

import java.util.Iterator;

public class SingleUser2 {

	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++) { //1000개의 요구
			//SingleObject2 single2 = new SingleObject2(); private로 막아서 밖에선 못만듦!!
			SingleObject2 single2 = SingleObject2.getInstance(); //있는지 없는지 체크해서, 있으면 그 주소 넘겨주고, 없으면 하나 만들어서 넘겨주고
		}
		
//		SingleObject single2 = new SingleObject();
		System.out.println(SingleObject2.count + "개");
		System.out.println(SingleObject2.count * 8 + 4 + "byte");
	}

}
