package com.mega.mvc1302;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {

	@Autowired
	BbsDAO dao;
	
	@Autowired
	ReplyDAO dao2;
	
	@RequestMapping("bbsall.mega")
	public void list(Model model) {
		List<BbsDTO> list = dao.list();
		model.addAttribute("list", list);
		System.out.println("전체 게시글 수>> " + list.size());
	}
	
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
	
	@RequestMapping("bbs_list")
	public void list2(Model model) {
		List<BbsDTO> list = dao.all();	
		System.out.println(list.size() + "=================");
		model.addAttribute("list", list);
	}
	
	@RequestMapping("one2") //게시판 상세페이지+댓글 리스트: db 2개 필요
	public void list(BbsDTO bbsDTO, Model model) {
		BbsDTO dto = dao.one(bbsDTO);
		ReplyDTO dto2 = new ReplyDTO();
		dto2.setBbsid(Integer.parseInt(bbsDTO.getId())); //dto에 string으로 해버려서 변환
		List<ReplyDTO> list2 = dao2.all(dto2);
		System.out.println(list2.size());
		System.out.println(dto);
		model.addAttribute("dto", dto);
		model.addAttribute("list2", list2);
	}
	
}
