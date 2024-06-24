package org.mm.controller;

import java.util.List;

import org.mm.entities.Student;
import org.mm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/student")
public class StudentController 
{
	@Autowired
	private StudentService studentService;

	@GetMapping(value = "")
	public ResponseEntity<List<Student>> index()
	{
		List<Student> result = studentService.findAll();
		return new ResponseEntity<List<Student>>(result, HttpStatus.OK);
	}
	
	@PostMapping(value = "")
	public ResponseEntity<Student> save(@RequestBody Student student)
	{
		Student result = studentService.save(student);
		return new ResponseEntity<Student>(result, HttpStatus.CREATED);
	}
}
