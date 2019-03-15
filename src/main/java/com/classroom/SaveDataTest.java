package com.classroom;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.classroom.modal.Lecturer;
import com.classroom.modal.Student;
import com.classroom.modal.Subject;
import com.classroom.service.LecturerService;
import com.classroom.service.StudentService;
import com.classroom.service.SubjectService;

public class SaveDataTest {/*
	private LecturerService lecturerService = ClassManagementSystemApplication.applicationContext
			.getBean("lecturerService", LecturerService.class);;

	private StudentService studentService = ClassManagementSystemApplication.applicationContext
			.getBean("studentService", StudentService.class);

	private SubjectService subjectService = ClassManagementSystemApplication.applicationContext
			.getBean("subjectService", SubjectService.class);

	public void saveTestData() {
		Student s1 = new Student();
		s1.setUSN("1RV17IS404");
		s1.setfName("Lata");
		s1.setmName("Rajesh");
		s1.setlName("Naik");
		s1.setDOB(new Date());
		s1.setMobileNo("8197597443");
		Student s2 = new Student();
		s2.setUSN("1RV17IS405");
		s2.setfName("Megha");
		s2.setmName("S");
		s2.setlName("Shetty");
		s2.setDOB(new Date());
		s2.setMobileNo("8195697443");
		Set<Student> students = new HashSet<Student>();
		students.add(s1);

		students.add(s2);

		Lecturer L1 = new Lecturer();
		L1.setID("17Is53");
		L1.setfName("Chetana");
		L1.setmName("R");
		L1.setlName("Murthy");
		L1.setMobileNo("8197597443");
		Lecturer L2 = new Lecturer();
		L2.setID("17Is54");
		L2.setfName("Priya");
		L2.setmName(" ");
		L2.setlName("D");
		L2.setMobileNo("8195697443");
		List<Lecturer> lecturerList = new ArrayList<Lecturer>();
		lecturerList.add(L1);
		lecturerList.add(L2);

		for (Lecturer lecturer : lecturerList) {
			lecturerService.createLecturer(lecturer);
		}

		Subject sub1 = new Subject();
		sub1.setSubID("16IS45");
		sub1.setSubName("WEB");
		sub1.setCredit(3);
		sub1.setIsLab(false);

		Subject sub2 = new Subject();
		sub2.setSubID("16IS44");
		sub2.setSubName("DBMS");
		sub2.setCredit(5);
		sub2.setIsLab(true);

		Set<Subject> subjects = new HashSet<Subject>();
		subjects.add(sub1);
		subjects.add(sub2);

		for (Subject subject : subjects) {
			subjectService.createSubject(subject);
		}
		for (Student student : students) {
			studentService.createStudent(student);
		}

		s1.setSubjects(subjects);
		s2.setSubjects(subjects);
		sub1.setStudents(students);
		sub2.setStudents(students);
		for (Subject subject : subjects) {
			subjectService.createSubject(subject);
		}
		for (Student student : students) {
			studentService.createStudent(student);
		}

	}

*/}
