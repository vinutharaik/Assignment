package com.te.reversesplit;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string to reversed");
		String string = scanner.nextLine();
		System.out.println("Enter the character");
		char ch = scanner.next().charAt(0);
		String reverse = UserMainCode.reshape(string, ch);
		System.out.println(reverse);
		
		

	}
}
