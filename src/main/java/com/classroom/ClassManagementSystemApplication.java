package com.classroom;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.classroom.modal.Student;
import com.classroom.service.StudentService;

@SpringBootApplication
public class ClassManagementSystemApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication
				.run(ClassManagementSystemApplication.class, args);
		StudentService studentService = applicationContext.getBean("studentService", StudentService.class);
		SaveStudentTest studentTest = new SaveStudentTest();
		List<Student> studentList = studentTest.getListOfStudent();
		for (Student student : studentList) {
			studentService.createStudent(student);
		}
	}

}
