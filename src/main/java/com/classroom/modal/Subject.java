package com.classroom.modal;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Subject {
	@Id
	private String subID;
	private String subName;
	private String lectureID;
	private int sem;
	private boolean isElective;
	private String departmentID;
	private boolean isLab;
	private int credit;
	private int totalMarks;
	private float totalAttendence;
	private float test1Attendence;
	private float test2Attendence;
	private float test3aAtendence;
	@ManyToMany(mappedBy = "subjects")
	private Set<Student> students;

	public String getSubID() {
		return subID;
	}

	public float getTotalAttendence() {
		return totalAttendence;
	}

	public void setTotalAttendence(float totalAttendence) {
		this.totalAttendence = totalAttendence;
	}

	public float getTest1Attendence() {
		return test1Attendence;
	}

	public void setTest1Attendence(float test1Attendence) {
		this.test1Attendence = test1Attendence;
	}

	public float getTest2Attendence() {
		return test2Attendence;
	}

	public void setTest2Attendence(float test2Attendence) {
		this.test2Attendence = test2Attendence;
	}

	public float getTest3aAtendence() {
		return test3aAtendence;
	}

	public void setTest3aAtendence(float test3aAtendence) {
		this.test3aAtendence = test3aAtendence;
	}

	public void setSubID(String subID) {
		this.subID = subID;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public String getLectureID() {
		return lectureID;
	}

	public void setLectureID(String lectureID) {
		this.lectureID = lectureID;
	}

	public int getSem() {
		return sem;
	}

	public void setSem(int sem) {
		this.sem = sem;
	}

	public boolean getIsElective() {
		return isElective;
	}

	public void setDepartmentID(String departmentID) {
		this.departmentID = departmentID;
	}

	public String getDepartmentID() {
		return departmentID;
	}

	public void setIsElective(boolean isElective) {
		this.isElective = isElective;
	}

	public boolean getIsLab() {
		return isLab;
	}

	public void setIsLab(boolean isLab) {
		this.isLab = isLab;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

}
