package com.example.demo;

import java.sql.Connection;
import java.sql.SQLException;

import javax.activation.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private SqlSessionFactory sessionFactory;
	
	private Connection conn;
	
	@Test
	void contextLoads() {
	}

//	@Test
//	public void 컨넥션생성테스트()  throws SQLException {
//		
//		System.out.println("dataSource --> " + dataSource);
//		
//		conn = dataSource.getConnection();
//		System.out.println("connection --> " + conn);
//		
//		conn.close();
//	}
	
	@Test
	public void 세션팩토리생성() {
		System.out.println("sqlSessionFactory -->" + sessionFactory);
	}
}
