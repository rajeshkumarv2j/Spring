package com.javapapers.spring3.autowire.collection;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Results {
		@Autowired
		private List<Ranks> ranks ;
		
		@Override
		public String toString(){
			return ranks.toString();
		}
}
