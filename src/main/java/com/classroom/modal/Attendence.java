package com.classroom.modal;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Attendence {
	@Id
	private String subID;
	private Date date;
	private String dayOfWeek;
	private String USN;
	private String name;
	private int unit;
	private String isLab;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
