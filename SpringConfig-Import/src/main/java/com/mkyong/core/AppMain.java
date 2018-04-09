package com.mkyong.core;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mkyong.config.AppConfig;
 
public class AppMain {
	public static void main(String[] args) {

		/*ApplicationContext context = 
		    	new ClassPathXmlApplicationContext(new String[] {"Spring-Common.xml",
		              "Spring-Connection.xml","Spring-ModuleA.xml"});*/
		
		/*<!-- 	<import resource="common/Spring-Common.xml"/>
        <import resource="connection/Spring-Connection.xml"/>
        <import resource="moduleA/Spring-ModuleA.xml"/> -->*/
        
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	    
		CustomerBo customer = (CustomerBo) context.getBean("customer");
	    customer.printMsg("Hello 1");
	    
	    SchedulerBo scheduler = (SchedulerBo) context.getBean("scheduler");
	    scheduler.printMsg("Hello 2");

	}
}