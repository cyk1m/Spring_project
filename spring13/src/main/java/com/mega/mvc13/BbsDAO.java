package com.mega.mvc13;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BbsDAO {

	@Autowired
	SqlSessionTemplate my;
	
	
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
	public void update() {
		
	}
	public void delete() {
		
	}
}
