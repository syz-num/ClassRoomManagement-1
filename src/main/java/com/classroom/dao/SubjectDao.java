package com.classroom.dao;

import org.springframework.data.repository.CrudRepository;

import com.classroom.modal.Subject;


public interface SubjectDao  extends CrudRepository<Subject,String> {

}
