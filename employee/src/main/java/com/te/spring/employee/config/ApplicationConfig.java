package com.te.spring.employee.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.te.spring.employee.bean.Employee;
import com.te.spring.employee.bean.Passport;

@Configuration
public class ApplicationConfig {
	@Bean("p1")
	public Passport getPassPort() {
		Passport passport = new Passport();
		passport.setPassNum(1);
		passport.setDateOfIssue("2022-01-01");
		passport.setDateOfExpiry("2023-12-31");
		return passport;
	}
	@Bean
	@Primary
	public Passport getPassPort1() {
		Passport passport = new Passport();
		passport.setPassNum(2);
		passport.setDateOfIssue("12-01-2021");
		passport.setDateOfExpiry("12-12-2031");
		return passport;
	}
	@Bean
	public Passport getPassPort2() {
		Passport passport = new Passport();
		passport.setPassNum(3);
		passport.setDateOfIssue("12-02-2020");
		passport.setDateOfExpiry("12-12-2030");
		return passport;
	}

@Bean("employee")
	public Employee getEmployee() {
		Employee employee = new Employee();
		employee.setEmpId(10);
		employee.setEmpName("xyz");
		return employee;
	}
}
