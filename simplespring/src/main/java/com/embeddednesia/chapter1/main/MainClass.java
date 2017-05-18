package com.embeddednesia.chapter1.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.embeddednesia.chapter1.service.GreetingMessageService;
import com.embeddednesia.chapter1.service.GreetingMessageServiceImpl;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		GreetingMessageService greetingMessageService=ctx.getBean("greetingMessageServiceImpl", GreetingMessageServiceImpl.class);
		System.out.println(greetingMessageService.greetUser());
	}
}
