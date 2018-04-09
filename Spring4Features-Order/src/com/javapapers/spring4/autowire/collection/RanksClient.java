package com.javapapers.spring4.autowire.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javapapers.spring3.autowire.collection.Results;

public class RanksClient {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Results results = (Results)context.getBean("results");
		System.out.println(results);
	}

}
