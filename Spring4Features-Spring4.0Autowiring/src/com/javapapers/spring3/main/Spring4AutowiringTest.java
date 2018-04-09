package com.javapapers.spring3.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javapapers.spring4.service.AlphabetService;
import com.javapapers.spring4.service.NumberService;

public class Spring4AutowiringTest {

	public static void main(String[] args) {
		System.out.println("main starts");
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("after application context loaded....");
		NumberService numService = (NumberService) context.getBean("numberService");
		System.out.println("after fetching number service....");
		System.out.println(numService.getNumber());
		System.out.println(numService.getNumber());

		AlphabetService alphabetService = (AlphabetService) context.getBean("alphabetService");
		System.out.println("after fetching alphabet service....");
		System.out.println(alphabetService.getAlphabet());
		System.out.println(alphabetService.getAlphabet());
		System.out.println("main ends");
	}
}