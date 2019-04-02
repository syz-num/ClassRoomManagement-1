package com.classroom.modal;

import java.util.List;

public class StudentData {
	private String subId;

	private List<StudentSubData> datas;

	public List<StudentSubData> getDatas() {
		return datas;
	}

	public void setDatas(List<StudentSubData> datas) {
		this.datas = datas;
	}

	public String getSubId() {
		return subId;
	}

	public void setSubId(String subId) {
		this.subId = subId;
	}

}
