package com.mega.mvc1302;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//DAO는 무조건 싱글톤으로 만들어줘야한다!
@Repository //getInstance로 객체 만들어놓은 것. 주소 생김. 이 안에 있는 메서드 다 부를 수 있다. 
			//싱글톤으로 만들어준다. 싱글톤을 만들 객체가 아니면 @ 달지 않는다!
public class MemberDAO {
	//기능을 처리하는 단위 1개를 메서드 1개로 만듦
	
	@Autowired //mybatis가 sql 객체화 해줌
	SqlSessionTemplate mybatis;
	
	public List<MemberDTO> list() { //전체검색. 입력값 없음
		//list의 결과를 mybatis가 List로 만들어서 줌
	 	List<MemberDTO> list = mybatis.selectList("memberMapper.all"); //mapper
	 	return list;
	}
	
	public MemberDTO check2(MemberDTO memberDTO) {
		MemberDTO dto = mybatis.selectOne("memberMapper.check2", memberDTO);
		return dto;
	}
	
	//로그인 기능
	public boolean login(MemberDTO dto) { //여기선 변수명 상관x 컨트롤러에서는 권장하는 것으로!
		//db연결했다 치고
		String dbId = "root";
		String dbPw = "1234";
		boolean result = false; //컨트롤러에 결과를 알려주기 위한 변수
		if (dto.getId().equals(dbId) && dto.getPw().equals(dbPw)) {
			result = true;
		}
		return result;
	}
	
	public void create(MemberDTO memberDTO) {
		mybatis.insert("memberMapper.create", memberDTO);
	}
	public MemberDTO read(MemberDTO memberDTO) {
		MemberDTO dto = mybatis.selectOne("memberMapper.one", memberDTO);
		return dto;
	}
	public void update() {
		
	}
	public int delete(MemberDTO memberDTO) {
		int result = mybatis.delete("memberMapper.del", memberDTO);
		return result;
	}
}
