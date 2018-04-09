package com.javapapers.spring3.autowire.collection;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class RankOne implements Ranks{

	private String rank = "RankOne";
	
	public String toString(){
		return this.rank;
	}
	
}
