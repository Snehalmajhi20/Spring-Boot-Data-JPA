package com.springbootdatajpa;

import org.springframework.context.ApplicationContext;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springbootdatajpa.Entity.PatientEntity;
import com.springbootdatajpa.Repository.PatientRepo;

@SpringBootApplication
public class SpringLect12DataJpaApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(SpringLect12DataJpaApplication.class, args);
		
		PatientRepo repo = context.getBean(PatientRepo.class);
		
//		CREATE Operation
		
		PatientEntity pte = new PatientEntity();
//		pte.setPatient_name("Amlan");
//		pte.setPatient_email("amlandash@gmail.com");
//		pte.setPatient_number("72052525209");
//		pte.setBlood_group("A+");
//		pte.setAddress("Bhadrak");
//		pte.setGender("male");
//		repo.save(pte);
//		
//		Read Operation
		
		List<PatientEntity> list = (List<PatientEntity>)repo.findAll();
		list.forEach(e ->System.out.println(e));
		
		//find data by using id
		 PatientEntity pte1 = repo.findById(7).get();
		 System.out.println(pte1);
		 
		//update Operation
//		 pte.setPatient_name("Amlan Dash");
//		 pte.setAddress("Kolkata");
//		 repo.save(pte);
		 
		 //delete Operation
		 PatientEntity pte2 = repo.findById(9).get();
		 repo.delete(pte2);
		 System.out.println("Deleted Successfully");
	}

}
