package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Student;
import com.student.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	public StudentService service;

	@GetMapping("/all")
	public List<Student> getAll() {
		return service.getAll();
	}

	@GetMapping("/{id}")
	public Student getById(@PathVariable int id) {
		return service.getById(id);
	}

	@PostMapping("/save")
	public Student save(@RequestBody Student student) {
		return service.save(student);
	}

	@PutMapping("/update/{id}")
	public Student update(@PathVariable int id, @RequestBody Student student) {
		return service.update(id, student);

	}

	@DeleteMapping("{id}")
	public void delete(@PathVariable int id) {
		service.delete(id);
	}
}
