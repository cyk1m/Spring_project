package com.mega.mvc08.generic;

public class Truck<T, B> {
	T weight;
	B distance;
	@Override
	public String toString() {
		return "Truck [weight=" + weight + ", distance=" + distance + "]";
	}
	
}
