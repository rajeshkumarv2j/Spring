package com.javapapers.spring3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javapapers.spring3.Generator;
import com.javapapers.spring3.NumberGenerator;

@Service
public class NumberService {

	@Autowired
	private NumberGenerator generator;
	
	/*@Autowired
	private Generator<Integer> generator;
	*/
	public NumberService(){
		System.out.println("NumberService d c ");
	}
	
	public Integer getNumber(){
		return generator.generate();
	}
}