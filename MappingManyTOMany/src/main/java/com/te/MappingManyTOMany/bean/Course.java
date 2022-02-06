package com.te.MappingManyTOMany.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.ManyToAny;

import lombok.Data;

@Data
@Entity
public class Course implements Serializable {
	@Id
	@Column
	private int cid;
	@Column
	private String courseName;
	@ManyToMany(cascade =  CascadeType.ALL)
	@JoinTable(name="Student_course",joinColumns = @JoinColumn(name="cid"),inverseJoinColumns = @JoinColumn(name="sid"))
	private List< Student>students;

}
