package com.springbootdatajpa.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PatientEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int patient_id;
	private String patient_name;
	private String patient_email;
	private String patient_number;
	private String blood_group;
	private String address;
	private String gender;
	
	public PatientEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PatientEntity(int patient_id, String patient_name, String patient_email, String patient_number, String blood_group, String address, String gender) {
		super();
		this.patient_id = patient_id;
		this.patient_name = patient_name;
		this.patient_email = patient_email;
		this.patient_number = patient_number;
		this.blood_group = blood_group;
		this.address = address;
		this.gender = gender;
	}
	public int getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}
	public String getPatient_name() {
		return patient_name;
	}
	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}
	public String getPatient_email() {
		return patient_email;
	}
	public void setPatient_email(String patient_email) {
		this.patient_email = patient_email;
	}
	public String getPatient_number() {
		return patient_number;
	}
	public void setPatient_number(String patient_number) {
		this.patient_number = patient_number;
	}
	public String getBlood_group() {
		return blood_group;
	}
	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "PatientEntity [patient_id=" + patient_id + ", patient_name=" + patient_name + ", patient_email="
				+ patient_email + ", patient_number=" + patient_number + ", blood_group=" + blood_group + ", address="
				+ address + ", gender=" + gender + "]";
	}

}
