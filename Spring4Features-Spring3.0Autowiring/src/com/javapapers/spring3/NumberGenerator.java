package com.javapapers.spring3;

import org.springframework.stereotype.Component;


/*
 * When we use @Component at class definition, Spring IOC Container
 * automatically generates an implicit qualifier for NumberGenerator bean as
 * ‘numberGenerator’.
 */
@Component
public class NumberGenerator implements Generator<Integer>{

	private Integer num = null;
	
	public NumberGenerator(){
		System.out.println("NumberGenerator d c");
		num = new Integer(1);	
	}
	
	@Override
	public Integer generate(){
		return num++;
	}
}