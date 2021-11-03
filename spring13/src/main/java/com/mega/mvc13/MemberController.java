package com.mega.mvc13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//annotation: 싱글톤 객체로 만들고, 스프링에 컨트롤러로 등록하는 역할
@Controller
public class MemberController {

	@Autowired //스프링이 만들어놓은 싱글톤 객체 생성된 것 중에 해당타입의 객체의 주소를 자동으로 넣어준다!
	MemberDAO dao; //여기서 선언된 데이터 타입을 가지고 구분, 찾아줌
	
	@RequestMapping("one.do")
	public void one(MemberDTO memberDTO, Model model) {
		System.out.println(memberDTO.getId());
		MemberDTO dto = dao.read(memberDTO);
		//dto의 데이터는 views/one.jsp로 출력되어야 클라이언트에게 보인다.
		//model 속성을 이용하면 views 아래까지 데이터를 보내고, 사라진다.
		//(세션보다 약한 느낌)
		model.addAttribute("bag", dto); //bag이란 이름으로 dto 값을 views로
	}	
	
	@RequestMapping("create.do")
	public void create(MemberDTO memberDTO) {
		System.out.println(memberDTO);
		dao.create(memberDTO);
	}
	
	
	@RequestMapping("login.mega") //요청하는 주소1개당 메서드1개
	public String login(MemberDTO memberDTO) {
		//컨트롤러의 메서드 내에 선언된 파라메터는 무조건 프로토타입으로 만들어진다.
		System.out.println(memberDTO); //컨트롤러에 값 잘 도착했는지 프린트
		System.out.println("싱글톤으로 만들어진 주소 프린트: " + dao); //브라우저A,B에서 요청시 dao 주소 동일하게 찍힘
		boolean result = dao.login(memberDTO); //주소있으면 메서드 호출가능
		if (result) {
			return "ok"; // views/ok.jsp 호출해라! .jsp안 붙임
		}else {
			return "no"; // views/no.jsp 호출해라.
			//void->String
		}
	}//login
	
	@RequestMapping("password.mega")
	public String pass(String pass) {
		System.out.println(pass); 
		if (pass.equals("1234")) {
			return "pass"; // views/pass.jsp
		}else {
			return "redirect:index.jsp"; //클라이언트에게 요청할때는 .jsp까지 써줘야함
			//=response.sendRedirect("index.jsp");
		}
	}
	
	@RequestMapping("check.mega")
	public String check(String nick) {
		System.out.println(nick);
		if (nick.equals("superman")) {
			return "super"; 
		}else {
			return "common"; 
		}
	}
	
}
