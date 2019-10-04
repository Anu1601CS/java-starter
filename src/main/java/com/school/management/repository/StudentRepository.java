package com.school.management.repository;

import com.school.management.model.StudentModel;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<StudentModel, String> {

}
