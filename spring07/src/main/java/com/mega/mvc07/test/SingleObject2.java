package com.mega.mvc07.test;

public class SingleObject2 {
	
	static int count;
	static SingleObject2 object; //null. 만들어준 주소를 넣을 변수 선언
	
	private SingleObject2() { //밖에서는 이 객체를 못 만들게 public->private로
		System.out.println("SingleObject 객체 생성됨@@");
		count++;
	}
	
	//싱글톤은 객체를 하나만 만들고, 더 이상 만들지 않는 방법.
	//getInstance라는 static 메서드를 만들어서 객체가 이미 만들어졌는지 체크를 하게 된다.
	public static SingleObject2 getInstance() {
		if(object == null) {
			//object이 null이라는 것은 아직 객체가 하나도 안 만들어졌다라는 의미
			//객체가 만들어지면 주소가 들어가야하는데 null이 들어가있기 때문
			object = new SingleObject2();
		}else {
			//object이 null이 아니라면, 객체가 만들어져서 주소가 들어갔다라는 의미
			//만들 필요x
		}
		return object;
	}
	
}
