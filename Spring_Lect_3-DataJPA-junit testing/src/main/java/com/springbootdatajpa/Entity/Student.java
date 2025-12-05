package com.springbootdatajpa.Entity;

import java.time.LocalDate;

//import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
/*
@Table(name = "student_table",
         uniqueConstraints = {
        		 @UniqueConstraint(name = "unique_student_email", columnNames = {"email"}),
        		 @UniqueConstraint(name = "unique_student_name_dob", columnNames = {"name","dob"})
         }
	)*/ //for unique name dob to give database for easy to find.
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
//	@Column(name = "student_name", nullable = false, length = 40)
	private String name;
	private LocalDate dob;
	private String email;
	private String gender;
	
	public Student() {
		super();
	}

	public Student(int id, String name, LocalDate dob, String email, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.email = email;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dob=" + dob + ", email=" + email + ", gender=" + gender
				+ "]";
	}

}
