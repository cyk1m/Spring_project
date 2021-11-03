package com.mega.mvc08.casting;

import com.mega.mvc08.box.Car;
import com.mega.mvc08.box.Truck;

public class CastingDerive {

	public static void main(String[] args) {
		//파생된 데이터, 참조형 변수
		//형변환(casting)
		//참조형 형변환은 "상속관계에 있는 클래스간" 가능
		Car c = new Car(); //부모, 수퍼클래스, 큰
		Truck t = new Truck(); //자식, 서브클래스, 작
		//클래스간의 크기는 "개념"을 가지고 큰/작 판별
		c = t; //큰<--자동형변환--작
		t = (Truck)c; //작<--강제형변환--큰
		
		
	}

}
