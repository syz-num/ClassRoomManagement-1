package com.classroom.modal;

import java.util.Date;

public class Attendance {
	private Double id;
	private String subID;
	private String USN;
	private Date date;
	private String dayOfWeek;
	private String subName;
	private int unit;
	private String isLab;

	public Double getId() {
		return id;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public void setId(Double id) {
		this.id = id;
	}

	public String getIsLab() {
		return isLab;
	}

	public void setIsLab(String isLab) {
		this.isLab = isLab;
	}

	public String getSubID() {
		return subID;
	}

	public void setSubID(String subID) {
		this.subID = subID;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public String getUSN() {
		return USN;
	}

	public void setUSN(String uSN) {
		USN = uSN;
	}

	public int getUnit() {
		return unit;
	}

	public void setUnit(int unit) {
		this.unit = unit;
	}

}
