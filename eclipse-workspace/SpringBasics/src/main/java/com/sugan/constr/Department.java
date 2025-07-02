package com.sugan.constr;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Department {
	private String deptName;
	private String deptHead;
	@Override
	public String toString() {
		return "Department [deptName=" + deptName + ", deptHead=" + deptHead + "]";
	}
	public String getDeptName() {
		return deptName;
	}
	
	@Value("CSE")
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptHead() {
		return deptHead;
	}
	@Value("Sudha")
	public void setDeptHead(String deptHead) {
		this.deptHead = deptHead;
	}
}
