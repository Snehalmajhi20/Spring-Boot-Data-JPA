package com.springbootdatajpa.Entity;

import org.hibernate.boot.model.naming.ImplicitNameSource;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "doctor_db")
public class Doctor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "doctor_id")
	private int id;
	private String name;
	private String specialization;
	private String email;
	@Column(name = "contact")
	private String phone_number;
	@Column(name = "address")
	private String location;
	private String gender;
	
	public Doctor() {
		super();
	}
	
	public Doctor(int id, String name, String specialization, String email, String phone_number, String location,
			String gender) {
		super();
		this.id = id;
		this.name = name;
		this.specialization = specialization;
		this.email = email;
		this.phone_number = phone_number;
		this.location = location;
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

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", specialization=" + specialization + ", email=" + email
				+ ", phone_number=" + phone_number + ", location=" + location + ", gender=" + gender + "]";
	}

}
