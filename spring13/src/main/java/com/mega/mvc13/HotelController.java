package com.mega.mvc13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //싱글톤 객체로 만들고, 스프링에 컨트롤러로 등록
public class HotelController {

	@Autowired //스프링이 만들어놓은 싱글톤 객체 생성된 것 중, //해당타입의 객체의 주소를 자동으로 넣어준다.
	HotelDAO dao; //여기서 선언된 데이터 타입을 가지고 구분, 찾아줌
	
	@RequestMapping("hotel.fly") //요청주소 1개당 메서드 1개
	public void insert(HotelDTO hotelDTO) {
		//컨트롤러의 메서드 내에 선언된 파라메터는 무조건 프로토타입으로 만들어진다.
		System.out.println(hotelDTO);
		dao.create(hotelDTO); //주소가 있으면 메서드 호출 가능
		//리턴으로 특정 jps 호출 안했으니 .fly 절삭하고 
		//views 아래 hotel.jsp를 자동으로 찾아 엶.
	}
	
	@RequestMapping("hotel2.fly")
	public void search(HotelDTO hotelDTO, Model model) {
		System.out.println(hotelDTO);
		HotelDTO dto = dao.read(hotelDTO);
		System.out.println(dto);
		model.addAttribute("bag", dto);
	}
	
}
