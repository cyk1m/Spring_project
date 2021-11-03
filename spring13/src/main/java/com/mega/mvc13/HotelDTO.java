package com.mega.mvc13;

import java.sql.Date;

public class HotelDTO {
	private String hid;
	private String hname;
	private String hregion;
	private String himage;
	private Date checkin;
	private Date checkout;
	private int guestnum;
	private String roomsort;
	private int stdprice;
	private int stdnum;
	public String getHid() {
		return hid;
	}
	public void setHid(String hid) {
		this.hid = hid;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	public String getHregion() {
		return hregion;
	}
	public void setHregion(String hregion) {
		this.hregion = hregion;
	}
	public String getHimage() {
		return himage;
	}
	public void setHimage(String himage) {
		this.himage = himage;
	}
	public Date getCheckin() {
		return checkin;
	}
	public void setCheckin(Date checkin) {
		this.checkin = checkin;
	}
	public Date getCheckout() {
		return checkout;
	}
	public void setCheckout(Date checkout) {
		this.checkout = checkout;
	}
	public int getGuestnum() {
		return guestnum;
	}
	public void setGuestnum(int guestnum) {
		this.guestnum = guestnum;
	}
	public String getRoomsort() {
		return roomsort;
	}
	public void setRoomsort(String roomsort) {
		this.roomsort = roomsort;
	}
	public int getStdprice() {
		return stdprice;
	}
	public void setStdprice(int stdprice) {
		this.stdprice = stdprice;
	}
	public int getStdnum() {
		return stdnum;
	}
	public void setStdnum(int stdnum) {
		this.stdnum = stdnum;
	}
	@Override
	public String toString() {
		return "HotelDTO [hid=" + hid + ", hname=" + hname + ", hregion=" + hregion + ", himage=" + himage
				+ ", checkin=" + checkin + ", checkout=" + checkout + ", guestnum=" + guestnum + ", roomsort="
				+ roomsort + ", stdprice=" + stdprice + ", stdnum=" + stdnum + "]";
	}

	
	
}
