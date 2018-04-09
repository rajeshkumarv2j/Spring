package com.journaldev.spring.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.journaldev.spring.service.MyService;

public class SpringMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

		System.out.println("Spring Context initialized");

		MyService service = ctx.getBean("myService", MyService.class);

		System.out.println("Bean retrieved from Spring Context");
		ctx.close();
		System.out.println("Spring Context Closed");
	}

}
