package org.mm.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "address")
public class Address
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String city;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "student_id",referencedColumnName = "id")
	private Student student;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Address(Long id, String city, Student student) {
		super();
		this.id = id;
		this.city = city;
		this.student = student;
	}

	public Address(String city, Student student) {
		super();
		this.city = city;
		this.student = student;
	}

	public Address(String city) {
		super();
		this.city = city;
	}

	public Address() {
		super();
	}
	
}
