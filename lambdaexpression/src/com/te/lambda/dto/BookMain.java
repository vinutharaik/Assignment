package com.te.lambda.dto;


public class BookMain {
	public static void main(String[] args) {
		String str="programming";
		StringBuffer buffer=new StringBuffer();
		str.chars().distinct().forEach(c->buffer.append((char)c));
		System.out.println(buffer);
	}

}
