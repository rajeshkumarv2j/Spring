package com.javapapers.spring3.autowire.collection;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class RankThree implements Ranks{

	private String rank = "RankThree";
	
	public String toString(){
		return this.rank;
	}
}
