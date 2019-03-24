package com.classroom.modal;

import java.util.Date;
import java.util.Set;

public class Student {

	private String USN;
	private String fName;
	private String mName;
	private String lName;
	private int sem;
	private String eMail;
	private String mobileNo;
	private String gender;
	private Date DOB;
	private Date DOJ;
	private String deptId;
	private String message;
	private String operation;
	private String keyUSN;
	private String subId;
	private String isPresent;
	private Set<Subject> subjects;

	public Set<Subject> getSubjects() {
		return subjects;
	}

	public String getSubId() {
		return subId;
	}

	public void setSubId(String subId) {
		this.subId = subId;
	}

	public void setSubjects(Set<Subject> subjects) {
		this.subjects = subjects;
	}

	public String getIsPresent() {
		return isPresent;
	}

	public void setIsPresent(String isPresent) {
		this.isPresent = isPresent;
	}

	public Date getDOB() {
		return DOB;
	}

	public String getKeyUSN() {
		return keyUSN;
	}

	public void setKeyUSN(String keyUSN) {
		this.keyUSN = keyUSN;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public Date getDOJ() {
		return DOJ;
	}

	public void setDOJ(Date dOJ) {
		DOJ = dOJ;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getUSN() {
		return USN;
	}

	public void setUSN(String uSN) {
		USN = uSN;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public int getSem() {
		return sem;
	}

	public void setSem(int sem) {
		this.sem = sem;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

}
