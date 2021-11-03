package com.mega.mvc07.test;

import java.util.Iterator;

public class SingleUser22 {

	public static void main(String[] args) {
		SingleObject2 single2 = SingleObject2.getInstance(); // 있는지 없는지 체크해서, 있으면 그 주소 넘겨주고, 없으면 하나 만들어서 넘겨주고
		System.out.println("주소: " + single2);
		System.out.println(SingleObject2.count + "개");
		System.out.println(SingleObject2.count * 8 + 4 + "byte");
	}

}
