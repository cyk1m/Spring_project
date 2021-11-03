package com.mega.mvc1302;

public class ReplyDTO {

	private int id;
	private String contnet;
	private String writer;
	private int bbsid;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContnet() {
		return contnet;
	}
	public void setContnet(String contnet) {
		this.contnet = contnet;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getBbsid() {
		return bbsid;
	}
	public void setBbsid(int bbsid) {
		this.bbsid = bbsid;
	}
	@Override
	public String toString() {
		return "ReplyDTO [id=" + id + ", contnet=" + contnet + ", writer=" + writer + ", bbsid=" + bbsid + "]";
	}
	
	
}
