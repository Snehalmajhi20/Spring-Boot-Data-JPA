package com.springbootdatajpa.Repositry;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springbootdatajpa.Entity.Doctor;

@Repository
public interface DoctorRepo extends CrudRepository<Doctor, Integer>{

}
