package com.logicbig.example;

import com.logicbig.example.bean.AlwaysBeingUsedBean;
import com.logicbig.example.bean.RarelyUsedBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

//@Lazy
@Configuration
public class AppConfig {

	@Bean
	public AlwaysBeingUsedBean alwaysBeingUsedBean() {
		return new AlwaysBeingUsedBean();
	}

	@Bean
	@Lazy
	public RarelyUsedBean rarelyUsedBean() {
		return new RarelyUsedBean();
	}
	
/*	beans.xml:
 * <beans>
		<bean id="rarelyUsedBean" class="com.logicbig.example.AppConfig"   lazy-init="true"/>
	</beans>*/
	
	
	/*beans.xml:
	 * <beans default-lazy-init="true">
			<bean id="rarelyUsedBean" class="com.logicbig.example.AppConfig" />
		<beans>*/
	
	public static void main(String... strings) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("Spring container started and is ready");
		RarelyUsedBean bean = context.getBean(RarelyUsedBean.class);
		bean.doSomething();
	}
}