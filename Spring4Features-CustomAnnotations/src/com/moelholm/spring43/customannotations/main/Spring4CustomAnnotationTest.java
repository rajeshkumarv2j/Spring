package com.moelholm.spring43.customannotations.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.moelholm.spring43.customannotations.GreeterService;

public class Spring4CustomAnnotationTest {

	public static void main(String[] args) {
		System.out.println("main starts");
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("after application context loaded....");
		GreeterService greeterService = (GreeterService) context.getBean("greeterService");
		System.out.println("after fetching number service....");
		System.out.println(greeterService.sayHello("Hello"));
		System.out.println("main ends");
	}
}