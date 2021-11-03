package com.mega.mvc10;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DBCPTest1 {

	public static void main(String[] args) {
		
		DBConnectionMgr dbcp = DBConnectionMgr.getInstance(); //10개의 커넥션 만들어 벡터에 쭉 넣어둠
		try {
			//1,2단계를 해줌. 드라이버설정, db연결까지 dbcp가 다 해주었음.
			//10개 중에 임대 안 된 것 하나를 갖다줌
			Connection con = dbcp.getConnection(); //연결된 것 1개를 가져옴
			//dbcp에서 연결해놓은 것 중 하나의 연결을 꺼내와서 3,4단계를 구현하면 됨
			
			String sql = "insert into member values ('sun','sun','sun','sun')";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.executeUpdate(); //4.
			//10개 중에서 하나 꺼내썼던 con(주소)를 다시 되돌려줌(나 다 썼어~!): 다시 10개로 채워지는!
			dbcp.freeConnection(con, ps);
			//freeConnection에 ps를 넣어두면 ps.close();가 내부적으로 적용되어, 안쓰는걸 램에서 빠르게 지워줌
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
