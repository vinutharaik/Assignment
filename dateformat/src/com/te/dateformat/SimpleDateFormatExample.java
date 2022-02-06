package com.te.dateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

public class SimpleDateFormatExample {
	public static void main(String[] args) {
		/*
		 * Date date = new Date(); SimpleDateFormat formatter = new
		 * SimpleDateFormat("dd/MM/yy"); String strDate= formatter.format(date);
		 * System.out.println(strDate);
		 */

		SimpleDateFormat dateInput = new SimpleDateFormat("yyyy-MM-dd");
		Scanner input = new Scanner(System.in);
System.out.println("Enter date");
		String strDate = input.nextLine();

		Date date;
		try {
			date = dateInput.parse(strDate);
			System.out.println(new SimpleDateFormat("yy-MM-dd").format(date));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}
}