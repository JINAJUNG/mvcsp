package com.ict.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ict.test.vo.Dept;
import com.zaxxer.hikari.HikariDataSource;

public class ConnectionTest {
	private ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:root-context.xml");
	
	@Test
	public void test() {	
		
		HikariDataSource hds = (HikariDataSource) ac.getBean("hkds");
		Connection con=null;
		try {
			con = hds.getConnection();
			System.out.println("성공이믄디ㅏㅇ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertNotNull(con);
	}
	
	@Test
	public void sqlTest() {
		SqlSession ss = (SqlSession)ac.getBean("sqlSessionTemplate");
		List<Dept> list = ss.selectList("DEPT.selectDept");
		assertEquals(list.size(), 4);
	}

}
