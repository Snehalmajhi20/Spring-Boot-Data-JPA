package com.springbootdatajpa;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springbootdatajpa.Entity.Student;
import com.springbootdatajpa.Repository.StudentRepo;

@SpringBootTest
public class StudentTest {
	
	@Autowired
	private StudentRepo sturepo;
	
	@Test
	public void testStudentRepo() {
		
		Student st = new Student();
		st.setName("Snehal");
		st.setDob(LocalDate.of(2001, 12, 20));
		st.setEmail("snehalmajhi@gmail.com");
		st.setGender("male");
		sturepo.save(st);
		
		List<Student> list = sturepo.findAll();
		System.out.println(list);
	}

}
