package com.te.MappingManyTOMany.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.MappingManyTOMany.bean.Course;
import com.te.MappingManyTOMany.bean.Student;

public class ManyToManyDriver {
	public static void main(String[] args) {

		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction = null;
		Student student = new Student();
		student.setSid(11);
		student.setSname("vinutha");
		Student student2 = new Student();
		student2.setSid(12);
		student2.setSname("abcd");
		Course course = new Course();
		course.setCid(22);
		course.setCourseName("java");
		Course course2 = new Course();
		course2.setCid(23);
		course2.setCourseName("python");
		List<Student> list = new ArrayList<Student>();
		list.add(student);
		list.add(student2);
		course.setStudents(list);
		try {
			factory = Persistence.createEntityManagerFactory("demo");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(course);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			if (factory != null) {
				factory.close();

			}
			if (manager != null) {
				manager.close();
			}
		}

	}

}
