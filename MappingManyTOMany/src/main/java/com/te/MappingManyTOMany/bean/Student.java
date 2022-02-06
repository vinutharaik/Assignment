package com.te.MappingManyTOMany.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import lombok.Data;

@Data
@Entity
@Table(name = "Student_info")
public class Student implements Serializable {
	@Id
	@Column
	private int sid;
	@Column
	private String sname;
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "students")
	private List<Course> courses;

}
