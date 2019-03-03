package com.classroom.dao;

import org.springframework.data.repository.CrudRepository;

import com.classroom.modal.Student;

public interface StudentDao extends CrudRepository<Student, String> {
}
