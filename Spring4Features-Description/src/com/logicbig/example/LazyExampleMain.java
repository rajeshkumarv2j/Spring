package com.logicbig.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.Lazy;

public class LazyExampleMain {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		System.out.println("--- container initialized ---");
		MyEagerBean bean = context.getBean(MyEagerBean.class);
		System.out.println("MyEagerBean retrieved from bean factory");
		bean.doSomethingWithLazyBean();
	}

	public static class MyConfig {

		@Bean
		@Description(value="This bean will be loaded at the time context loaded")
		public MyEagerBean eagerBean() {
			return new MyEagerBean();
		}

		@Bean
		@Description(value="This bean will be loaded lazily, not at the time context loaded but whenever anu other bean tried to access")
		@Lazy
		public MyLazyBean lazyBean() {
			return new MyLazyBean();
		}
		
		/*	beans.xml:
		 * <beans>
				<bean id="rarelyUsedBean" class="com.logicbig.example.AppConfig"   lazy-init="true"/>
			</beans>*/
			
			
		/*beans.xml:
		 * <beans default-lazy-init="true">
				<bean id="rarelyUsedBean" class="com.logicbig.example.AppConfig" />
			<beans>*/
	}
}