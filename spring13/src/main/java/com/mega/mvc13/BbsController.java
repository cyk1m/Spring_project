package com.mega.mvc13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {

	@Autowired
	BbsDAO dao;
	
	@RequestMapping("bbs.mega")
	public void insert(BbsDTO bbsDTO) {
		System.out.println(bbsDTO);
		dao.create(bbsDTO);
	}
	
	@RequestMapping("bbs2.mega")
	public void one2(BbsDTO bbsDTO, Model model) {
		System.out.println(bbsDTO.getId());
		BbsDTO dto = dao.read(bbsDTO);
		model.addAttribute("bag", dto);
	}
	
}
