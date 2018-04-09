package com.javapapers.spring3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javapapers.spring3.AlphabetGenerator;

@Service
public class AlphabetService {
//
	@Autowired
	private AlphabetGenerator generator;
	
//	private Generator<String> generator;
//	No unique bean of type [com.javapapers.spring3.Generator] is defined: expected single matching bean but found 2: [alphabetGenerator, numberGenerator]*
	
	public AlphabetService() {
		System.out.println("AlphabetService d c ");
	}

	public String getAlphabet() {
		return generator.generate();
	}
}