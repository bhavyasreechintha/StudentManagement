package com.student.service;

import java.util.List;

import com.student.entity.Student;

public interface StudentService {

	
public List<Student> getAll();
public Student getById(int id);
public Student save(Student student);
public Student update(int id, Student student);
public void delete(int id);
}
