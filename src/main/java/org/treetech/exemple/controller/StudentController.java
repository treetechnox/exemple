package org.treetech.exemple.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.treetech.exemple.dao.DepartementRepository;
import org.treetech.exemple.dao.StudentRepository;
import org.treetech.exemple.entities.Departement;
import org.treetech.exemple.entities.Student;

import javax.validation.Valid;
import java.util.List;

@RestController
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private DepartementRepository departementRepository;
	
	/*@GetMapping("/recherche")
	public List<Student> getRechStudents(@RequestParam(name = "id_dept") Long id_dept){
		return studentRepository.getSearchStudent(id_dept);
	}*/

	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return studentRepository.findAll();
	}

	@GetMapping(value = "/students/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable(value = "id") Long id) throws Exception {
		Student student = studentRepository.findById(id).orElseThrow(() -> new Exception("Student "+id+" not found..."));
		return ResponseEntity.ok().body(student);
	}

	@PostMapping("/students")
	public Student addStudent(@Valid @RequestBody Student student){
		return studentRepository.save(student);
	}


	@GetMapping("/dept")
	public List<Departement> getAllDepartement(){
		return departementRepository.findAll();
	}


	@GetMapping("/dept/{id}")
	public ResponseEntity getDepartementById(@PathVariable(value = "id") Long id) throws Exception {
		Departement departement
				= departementRepository.findById(id).orElseThrow(() -> new Exception("Departement "+id+" not found"));
		return ResponseEntity.ok().body(departement);
	}


}
