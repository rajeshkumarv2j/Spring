package com.javapapers.spring4;

import org.springframework.stereotype.Component;

/*Spring IOC Container automatically generates an implicit qualifier for 
	AlphabetGenerator bean as ‘alphabetGenerator’.*/
@Component
public class AlphabetGenerator implements Generator<String> {

	private char alphabet;
	
	public AlphabetGenerator() {
		System.out.println("AlphabetGenerator d c");
		alphabet = 65;
	}

	@Override
	public String generate() {
		return "" + (alphabet++);
	}
}