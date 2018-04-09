package com.websystique.spring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("driver")
public class Driver {

	
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
	
	private License license;
	
	
	@Autowired
	public void setLicense(License license) {
		this.license = license;
	}

	public License getLicense() {
		return license;
	}

	@Override
	public String toString() {
		return "Driver [license=" + license + "]";
	}
	
	
}
