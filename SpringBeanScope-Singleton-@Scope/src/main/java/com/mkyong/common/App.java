package com.mkyong.common;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.mkyong.customer.services.CustomerService;

@Configuration
@ComponentScan(basePackages= {"com.mkyong"})
public class App {
	
	@Bean
	public CustomerService getCustomService() {
		return new CustomerService();
	}
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);

		CustomerService custA = (CustomerService) context.getBean("customerService");
		custA.setMessage("Message by custA");
		System.out.println("Message : " + custA.getMessage());

		// retrieve it again
		CustomerService custB = (CustomerService) context.getBean("customerService");
		System.out.println("Message : " + custB.getMessage());
	}
}
