package com.springbootdatajpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springbootdatajpa.Repositry.DoctorRepo;
import com.springbootdatajpa.Entity.Doctor;

@SpringBootApplication
public class SpringLect2DataJpaApplication implements CommandLineRunner{
	
	@Autowired
	private DoctorRepo docrepo;

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(SpringLect2DataJpaApplication.class, args);
//		DoctorRepo docrepo = context.getBean(DoctorRepo.class);
	}

	@Override
	public void run(String... args) throws Exception {
		
//		create data
		
		Doctor dc = new Doctor();
//		dc.setName("Jagannath Bhattacharjee");
//		dc.setSpecialization("Medicine Specialist");
//		dc.setEmail("jagannathbhatt@gmail.com");
//		dc.setPhone_number("6370129221");
//		dc.setLocation("Bhadrak, Odisha");
//		dc.setGender("male");
//		docrepo.save(dc);
		
//		Read the data
		
		List<Doctor> list = (List<Doctor>)docrepo.findAll();
		list.forEach(e ->System.out.println(e));
//		for (Doctor doctor : list) {
//			System.out.println(doctor);
//		}
		
		Doctor dc1 = docrepo.findById(1).get();
		System.out.println(dc1);
		
//		update the data
		
		dc1.setLocation("Kolkata");
		dc1.setGender("Male");
		docrepo.save(dc1);
		
//		delete the data
		
		Doctor dc2 = docrepo.findById(2).get();
		docrepo.delete(dc2);
		System.out.println("Deleted Data successfully");
		
	}

}
