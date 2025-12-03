package com.springbootdatajpa.Repository;

import org.springframework.data.repository.CrudRepository;
import com.springbootdatajpa.Entity.PatientEntity;

public interface PatientRepo extends CrudRepository<PatientEntity, Integer>{

}
