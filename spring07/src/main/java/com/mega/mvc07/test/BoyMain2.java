package com.mega.mvc07.test;

public class BoyMain2 {

	public static void main(String[] args) {
		//있는지 없는지 체크해서, 있으면 그 주소 넘겨주고, 없으면 하나 만들어서 넘겨주고
		Boy2 boy1 = Boy2.getInstance();
		Boy2 boy2 = Boy2.getInstance();
		
		System.out.println(boy1);
		System.out.println(boy2);
	}

}
