package com.mega.mvc08.box;

public class 볼펜Main{

	public static void main(String[] args) {
		Truck t = new Truck();
		t.stationery = "연필";
		t.price = 500;
		t.company = "mega";
		t.pen = "볼펜";
		t.thick = "굵기 0.5";
		System.out.println(t);
		t.buy();
		t.write();
	}

}
