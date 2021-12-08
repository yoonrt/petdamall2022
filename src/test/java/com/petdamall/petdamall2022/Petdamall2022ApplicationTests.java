package com.petdamall.petdamall2022;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Petdamall2022ApplicationTests {

	@Test
	void contextLoads() {
	}
	@Autowired
	private ApplicationContext context;
	@Autowired
	private SqlSessionFactory sessionFactory;
	@Test
	public void testByContext(){
		try{
			System.out.println("==================");
			System.out.println(context.getBean("sqlSessionFactory"));
			System.out.println("==================");
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	@Test
	public void testSqlSessionFactory(){
		try{
			System.out.println("==================");
			System.out.println(sessionFactory.toString());
			System.out.println("==================");
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
