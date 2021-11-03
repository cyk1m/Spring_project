package com.mega.mvc08.box;

public class Truck extends Car{
	String pen;
	String thick;
	
	public void write() {
		System.out.println("글을 쓰다.");
	}

	@Override
	public String toString() {
		return "Truck [pen=" + pen + ", thick=" + thick + ", stationery=" + stationery + ", price=" + price
				+ ", company=" + company + "]";
	}
	
}
