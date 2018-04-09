package com.javapapers.spring4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javapapers.spring4.Generator;

@Service
public class NumberService {

	@Autowired
	private Generator<Integer> generator;

	public NumberService() {
		System.out.println("NumberService d c");
	}

	public Integer getNumber() {
		return generator.generate();
	}
}