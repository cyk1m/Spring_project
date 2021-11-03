package com.mega.mvc13;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HotelDAO {

	@Autowired
	SqlSessionTemplate ho;

	//기능을 처리하는 단위 1개를 메서드 1개로 만듦
	public void create(HotelDTO hotelDTO) {
		System.out.println(hotelDTO);
		ho.insert("hotelMapper.create", hotelDTO);
	}

	public HotelDTO read(HotelDTO hotelDTO) {
		System.out.println(hotelDTO);
		HotelDTO dto = ho.selectOne("hotelMapper.one", hotelDTO);
		System.out.println("dao>> " + dto);
		return dto;
	}

	public void update() {

	}

	public void delete() {

	}

}
