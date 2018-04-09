package com.websystique.spring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Bond {

	/*
	 * <?xml version="1.0" encoding="UTF-8"?>
		<beans ----		default-autowire="byName" default-autowire-candidates="*" ></beans>
		
		<bean name="employee1" class="com.journaldev.spring.autowiring.model.Employee" autowire-candidate="false">
		
		<!-- autowiring byName, bean name should be same as the property name -->
		<bean name="employeeServiceByName" class="com.journaldev.spring.autowiring.service.EmployeeService" autowire="byName" />

		
		<!-- autowiring byType, there should be only one bean definition for the mapping -->
		<bean name="employeeServiceByType" class="com.journaldev.spring.autowiring.service.EmployeeService" autowire="byType" />
		
		
		<!-- autowiring by constructor -->
		<bean name="employeeServiceConstructor" class="com.journaldev.spring.autowiring.service.EmployeeService" autowire="constructor" />
	 */
	
	
	/*
	 * By default, @Autowored annotation makes sure that field is indeed autowired.
	 * In case autowiring is not successful, Spring will throw an exception. There
	 * are times however when you want to make autowiring optional.
	 * Setting @Autowired required attribute to ‘false’ will make this filed
	 * optional for autowiring and Spring will skip it(remain null) if dependency
	 * not found.
	 * 
	 * Note that standard @Resource annotation does not have this flexibility. In
	 * case the dependency annotated with @Resource not found, Spring will throw an
	 * exception. Both @Resource and @Autowired have few differences : No
	 * optionality in @Resource and no autowiring by bean name in @Autowired.
	 */
	@Autowired(required=false)
//	@Qualifier("Mustang")
	@Qualifier("Ferari")
	private Car car;
	
	public void showCar(){
		car.getCarName();
	}
}
