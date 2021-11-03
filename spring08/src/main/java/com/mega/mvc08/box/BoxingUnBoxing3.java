package com.mega.mvc08.box;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import com.mega.mvc08.MemberDTO;

public class BoxingUnBoxing3 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		//add(Object o): Object자리에는 모든 클래스가 다 들어갈 수 있다.
		//add(참조형 변수의 주소) <--auto-boxing-- add(기본형)
		list.add("hong");
		list.add(new Date());
		list.add(new Random());
		list.add(new MemberDTO());
		//기본형은 class가 아니므로 Object의 자식이 아니다. 그러나!
		list.add(100); //Integer(클래스) <--오토박싱-- int
		list.add(11.1); //Double <--오토박싱-- double
		list.add(true); //Boolean <--오토박싱-- boolean
		list.add('a'); //Character <--오토박싱-- char
		System.out.println(list);
	}

}
