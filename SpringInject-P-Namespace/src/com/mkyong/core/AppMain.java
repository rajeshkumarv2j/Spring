package com.mkyong.core;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mkyong.common.FileNameGenerator;
 
public class AppMain {
	public static void main(String[] args) {

		ApplicationContext context = 
		    	new ClassPathXmlApplicationContext("applicationContext.xml");
		
	    
		FileNameGenerator customer = (FileNameGenerator) context.getBean("FileNameGenerator");
	    System.out.println(customer.getName());
	    System.out.println(customer.getType());

	    FileNameGenerator customer1 = (FileNameGenerator) context.getBean("FileNameGenerator1");
	    System.out.println(customer1.getName());
	    System.out.println(customer1.getType());

	    
	    FileNameGenerator customer2 = (FileNameGenerator) context.getBean("FileNameGenerator2");
	    System.out.println(customer2.getName());
	    System.out.println(customer2.getType());

	}
}