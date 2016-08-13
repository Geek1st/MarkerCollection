package com.geeklib.model;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.geeklib.service.IUserService;

public class TestUser
{
	
	
	@Test
	public void testJdbc()
	{
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		IUserService userService = applicationContext.getBean("userSerivce", IUserService.class);
		
		User user = userService.queryById(1);
		
		System.out.println(user.getUsername());
	}
}
