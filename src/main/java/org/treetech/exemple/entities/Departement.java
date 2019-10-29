package org.treetech.exemple.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Departement implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_dept;
	private String dept;
	
	//
	private int student_capacity;
	public Long getId_dept() {
		return id_dept;
	}
	public void setId_dept(Long id_dept) {
		this.id_dept = id_dept;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getStudent_capacity() {
		return student_capacity;
	}
	public void setStudent_capacity(int student_capacity) {
		this.student_capacity = student_capacity;
	}
	
	public Departement() {
	}
	public Departement(String dept, int student_capacity) {
		this.dept = dept;
		this.student_capacity = student_capacity;
	}
	
	
}
