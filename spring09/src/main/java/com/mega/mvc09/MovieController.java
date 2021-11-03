package com.mega.mvc09;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {

	@Autowired
	MovieDAO dao;

	@RequestMapping("movie.do")
	public String movie(String title, int price) {
		//1.컨트롤러에서 받은 값 프린트
		System.out.println("영화제목: " + title);
		System.out.println("영화관람표: " + price + "원");
		//2.관람료가 10000원 이상이면 결제하는 화면으로 넘기세요.
		//3.10000원 미만이면 재입력할 수 있도록 webapp/movie.jsp로 넘기세요.
		if (price >= 10000) {
			return "movie";
		} else {
			return "redirect:movie.jsp";
		}
	}//movie
	
	@RequestMapping("pay.do")
	public void moviePay() {
		dao.pay();
	}
	
}
