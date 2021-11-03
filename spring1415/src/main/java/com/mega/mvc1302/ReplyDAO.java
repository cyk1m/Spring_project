package com.mega.mvc1302;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

@Repository
public class ReplyDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public void create(ReplyDTO replyDTO) {
		System.out.println(replyDTO);
		int result = my.insert("reply.add", replyDTO);
		System.out.println(result);
	}
	
	public List<ReplyDTO> all(ReplyDTO replyDTO) { //bbsid에 해당하는 댓글만 가져와야
		return my.selectList("reply.all", replyDTO); //bbsid를 줘야해서 입력값 넣는다
	}
	
	public void update() {
		
	}
	public void delete() {
		
	}
}
