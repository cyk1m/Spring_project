package com.mega.mvc07;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController{ //클래스명은 이거 아니어도 됨
	
	@RequestMapping("in.mega") //이름은내맘대로
	public void insert(MemberDTO dto) { //입력값 dto에 다 들어있음 request.getparameter 안해도 됨
		System.out.println("컨트롤러 메서드 호출됨....");
		System.out.println("컨트롤러에서 받은 id: " + dto.getId());
		System.out.println("컨트롤러에서 받은 pw: " + dto.getPw());
		System.out.println("컨트롤러에서 받은 name: " + dto.getName());
		System.out.println("컨트롤러에서 받은 tel: " + dto.getTel());
		//여기부터 dao처리 해줄 예정...
		//서버가 결과를 알려주기 위한 페이지가 필요!!!(클라이언트 요청 아님)
	}
	
	@RequestMapping("check.mega")
	public void getList(MemberDTO dto) {
		System.out.println("컨트롤러 메서드 호출됨....");
		System.out.println("컨트롤러에서 받은 id: " + dto.getId());
		System.out.println("컨트롤러에서 받은 pw: " + dto.getPw());
		//컨트롤러에서 처리를 한 후, 클라이언트에게 결과를 알려줘야 한다.
		//views아래에 check.jsp로 만든다.
	}
	
}
