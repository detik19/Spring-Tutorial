package com.embeddednesia.chapter1.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingMessageServiceImpl implements GreetingMessageService {

	public String greetUser() {
		// TODO Auto-generated method stub
		return "Hello Spring";
	}

}
