package com.te.spring.employee.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.spring.employee.bean.Employee;
import com.te.spring.employee.config.ApplicationConfig;

public class Driver {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		System.out.println(context);
		Employee employee = (Employee) context.getBean("employee", Employee.class);
		System.out.println(employee);
	}

}
