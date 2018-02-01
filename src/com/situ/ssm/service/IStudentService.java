package com.situ.ssm.service;

import java.util.List;

import com.situ.ssm.entity.Student;

public interface IStudentService {
	List<Student> findAll();

	Student findById(Integer id);

	void deleteById(Integer id);
}
