package com.classroom.modal;

import java.util.Set;

public class Subject {
	private String subID;
	private String subName;
	private String lectureID;
	private int sem;
	private String isElective;
	private String isLab;
	private int credit;
	private int totalMarks;
	private float totalAttendence;
	private float test1Attendence;
	private float test2Attendence;
	private float test3Attendence;
	private String courseStage;
	private int academicYear;
	private String deptId;
	private Set<Student> students;
	private String message;
	private String operation;
	private String keyID;

	public String getCourseStage() {
		return courseStage;
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getKeyID() {
		return keyID;
	}

	public void setKeyID(String keyID) {
		this.keyID = keyID;
	}

	public void setCourseStage(String courseStage) {
		this.courseStage = courseStage;
	}

	public int getAcademicYear() {
		return academicYear;
	}

	public void setAcademicYear(int academicYear) {
		this.academicYear = academicYear;
	}

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

	public float getTest3Attendence() {
		return test3Attendence;
	}

	public void setTest3Attendence(float test3Attendence) {
		this.test3Attendence = test3Attendence;
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

	public String getIsElective() {
		return isElective;
	}

	public void setIsElective(String isElective) {
		this.isElective = isElective;
	}

	public String getIsLab() {
		return isLab;
	}

	public void setIsLab(String isLab) {
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
