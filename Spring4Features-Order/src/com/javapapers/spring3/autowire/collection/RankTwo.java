package com.javapapers.spring3.autowire.collection;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class RankTwo implements Ranks{

	private String rank = "RankTwo";
	
	public String toString(){
		return this.rank;
	}
}
