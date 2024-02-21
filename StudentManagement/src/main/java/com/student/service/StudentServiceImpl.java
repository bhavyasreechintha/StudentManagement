package com.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Student;
import com.student.exception.StudentsNotFoundException;
import com.student.repo.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepo repo;

	@Override
	public List<Student> getAll() {

		List<Student> stu = repo.findAll();
		if (stu.isEmpty()) {
			throw new StudentsNotFoundException("Students are not found");
		}
		return stu;

	}

	@Override
	public Student getById(int id) {
		return repo.findById(id).orElseThrow(() -> new StudentsNotFoundException("student not found with id  " + id));

	}

	@Override
	public Student save(Student student) {

		return repo.save(student);

	}

	@Override
	public Student update(int id, Student student) {
		Optional<Student> stu = repo.findById(id);
		if (stu.isPresent()) {
			Student stu1 = stu.get();
			stu1.setSname(student.getSname());
			stu1.setSage(student.getSage());

			return repo.save(stu1);
		} else {
			throw new StudentsNotFoundException("Student not found with id: " + id);
		}

	}

	public StudentServiceImpl(StudentRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public void delete(int id) {
		repo.deleteById(id);

	}

}
