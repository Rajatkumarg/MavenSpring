package com.rajat.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component
public class Employee {

	@Value("101")
	private int empId;
	private String empName;
	
	public Employee() {
		System.out.println("Creating Employee object");
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	@Value("Muti")
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	
}
