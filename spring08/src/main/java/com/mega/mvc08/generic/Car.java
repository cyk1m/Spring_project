package com.mega.mvc08.generic;

public class Car<T> { //융통성있게 타입을 결정할 수 있다는 것(t는 별 의미x)
	T size; 

	@Override
	public String toString() {
		return "Car [size=" + size + "]";
	}
	
}
