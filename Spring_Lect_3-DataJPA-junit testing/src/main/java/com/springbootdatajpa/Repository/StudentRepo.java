package com.springbootdatajpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootdatajpa.Entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
