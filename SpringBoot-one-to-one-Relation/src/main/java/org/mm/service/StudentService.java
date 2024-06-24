package org.mm.service;

import java.util.List;

import org.mm.dao.StudentRepository;
import org.mm.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService 
{
	@Autowired
	private StudentRepository studentRepository;
	
	
	public List<Student> findAll()
	{
		return studentRepository.findAll();
	}
	
	public Student save(Student student)
	{
		return studentRepository.save(student);
	}
}
