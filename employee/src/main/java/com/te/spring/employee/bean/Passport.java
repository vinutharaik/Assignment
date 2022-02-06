package com.te.spring.employee.bean;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
public class Passport implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int passNum;
	private String dateOfIssue;
	private String dateOfExpiry;

}
