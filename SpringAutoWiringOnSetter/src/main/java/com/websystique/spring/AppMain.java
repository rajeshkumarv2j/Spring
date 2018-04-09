package com.websystique.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.websystique.spring.config.AppConfig;
import com.websystique.spring.domain.Driver;

public class AppMain {

	public static void main(String args[]) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		// Setter Autowiring
		Driver driver = (Driver) context.getBean("driver");
		System.out.println("Driver Details : " + driver);
	}

}
