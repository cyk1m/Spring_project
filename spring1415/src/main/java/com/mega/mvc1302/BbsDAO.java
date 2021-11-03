package com.mega.mvc1302;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

@Repository
public class BbsDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public List<BbsDTO> list() {
		List<BbsDTO> list = my.selectList("bbs.all");
		return list;
	}
	
	public void create(BbsDTO bbsDTO) {
		System.out.println(bbsDTO);
		int result = my.insert("bbs.add", bbsDTO);
		System.out.println(result);
	}
	public BbsDTO read(BbsDTO bbsDTO) {
		System.out.println(bbsDTO);
		BbsDTO dto = my.selectOne("bbs.one", bbsDTO);
		return dto;
	}
	
	public List<BbsDTO> all() {
		return my.selectList("bbs.all");
	}
	
	public BbsDTO one(BbsDTO bbsDTO) {
		return my.selectOne("bbs.one", bbsDTO);
	}
	
	public void update() {
		
	}
	public void delete() {
		
	}
}
