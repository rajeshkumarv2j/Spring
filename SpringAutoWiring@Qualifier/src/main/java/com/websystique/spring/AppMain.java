package com.websystique.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.websystique.spring.config.AppConfig;
import com.websystique.spring.domain.Bond;

public class AppMain {

	public static void main(String args[]) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Bond bond = (Bond) context.getBean("bond");
		bond.showCar();
	}

}
