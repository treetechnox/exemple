package org.treetech.exemple.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Student implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "departement_id", referencedColumnName = "id_dept")
	private Departement departement;
	private int univ_year;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Departement getDepartement() {
		return departement;
	}
	public void setDepartement(Departement departement) {
		this.departement = departement;
	}
	public int getUniv_year() {
		return univ_year;
	}
	public void setUniv_year(int univ_year) {
		this.univ_year = univ_year;
	}
	
	public Student() {
		
	}
	public Student(String name, Departement departement, int univ_year) {

		this.name = name;
		this.departement = departement;
		this.univ_year = univ_year;
	}
	
	
	
}
