package com.te.reversesplit;

public class UserMainCode {
	public static String reshape(String str, char ch) {
		String reverseString = "";
		char[] try1 = str.toCharArray();
		for (int i = try1.length - 1; i <= 0; i--) {
			reverseString = reverseString + ch + try1[i];
		}
		return reverseString;
	}
}
