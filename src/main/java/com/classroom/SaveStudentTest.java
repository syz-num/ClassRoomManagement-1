package com.classroom;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.classroom.modal.Student;

public class SaveStudentTest {

	public List<Student> getListOfStudent() {
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
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(s1);
		studentList.add(s2);
		return studentList;

	}

}
