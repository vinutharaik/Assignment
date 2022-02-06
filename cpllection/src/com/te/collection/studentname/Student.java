package com.te.collection.studentname;

public class Student implements Comparable<Student> {
	String name;

	public Student(String string) {
		this.name = string;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

	@Override
	public int compareTo(Student o) {

		
			return o.name.compareTo(name);

	

}
}
