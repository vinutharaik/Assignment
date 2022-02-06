package com.te.collection.studentname;

import java.util.ArrayList;

public class StudentName {

	public static void main(String[] args) {
		/*
		 * ArrayList<String> arrayList = new ArrayList<String>();
		 * arrayList.add("vinutha"); arrayList.add("abcde"); arrayList.add("ankitha");
		 * arrayList.add("bhavya");
		 * 
		 * TreeSet<String> set = new TreeSet<>(); set.addAll(arrayList);
		 * System.out.println(set.descendingSet());
		 */
		ArrayList<Student> arrayList = new ArrayList<Student>();
		arrayList.add(new Student("vinutha"));
		arrayList.add(new Student("abcde"));
		arrayList.add(new Student("bhavya"));
		System.out.println(arrayList);

	}

}
