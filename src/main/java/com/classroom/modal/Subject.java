package com.classroom.modal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subject {
	@Id
	private String subID;
	private String subName;
	private String lectureID;
	private int sem;
	private String cycle;
	private boolean isElective;
	private String departmentID;
	private boolean isLab;
	private int credit;
	private int totalMarks;
	private float totalAttendence;
	private float test1Attendence;
	private float test2Attendence;
	private float test3aAtendence;
	
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
	public String getCycle() {
		return cycle;
	}
	public void setCycle(String cycle) {
		this.cycle = cycle;
	}
	public boolean isElective() {
		return isElective;
	}
	public void setElective(boolean isElective) {
		this.isElective = isElective;
	}
	public String getDepartmentID() {
		return departmentID;
	}
	public void setDepartmentID(String departmentID) {
		this.departmentID = departmentID;
	}
	public boolean isLab() {
		return isLab;
	}
	public void setLab(boolean isLab) {
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
	

}
