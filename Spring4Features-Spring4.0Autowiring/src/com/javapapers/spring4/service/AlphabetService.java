package com.javapapers.spring4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javapapers.spring4.Generator;

@Service
public class AlphabetService {

	@Autowired
	private Generator<String> generator;
	
	public AlphabetService(){
		System.out.println("AlphabetService d c");
	}
	
	public String getAlphabet(){
		return generator.generate();
	}
	
}