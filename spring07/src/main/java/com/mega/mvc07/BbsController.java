package com.mega.mvc07;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//annotation 달아놓은 클래스들은 스프링 프로젝트에서 모두 다 싱글톤!!!
@Controller //annotation(@)으로 상속받아야 컨트롤러가 됨.
public class BbsController {
	
	//요청되는 가상 주소는 중복되면 절대 안 됨! unique해야!!
	@RequestMapping("bbs") //form action이랑 동일하게.
	//컨트롤러의 입력값으로  넣은 변수는 프로토타입 변수.
	public void bbs(BbsDTO bbsDTO, String date) { //클래스명과 동일하게, 첫글자만 소문자로 하면 views의 jsp에서 ${} EL 쓸 수 있다. 자동으로.
												  //dto에 없지만 새로 넣은 변수 추가하기. 대신 이건 bbsDTO EL로 자동으로 못 넘김.
		//컨트롤러에서 받은 것 확인, 출력
		System.out.println(bbsDTO);
		System.out.println(date);
		//views아래에 결과 화면 만들어서 넣어주세요.
//		System.out.println("컨트롤러에서 받은 bNo: " + bbsDTO.getbNo());
//		System.out.println("컨트롤러에서 받은 title: " + bbsDTO.getTitle());
//		System.out.println("컨트롤러에서 받은 content: " + bbsDTO.getContent());
//		System.out.println("컨트롤러에서 받은 writer: " + bbsDTO.getWriter());
		
	}
}
