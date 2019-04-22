package com.cdac.fileio.bytestream;

import java.io.Serializable;

public class Employee implements Serializable{
	
	private int empId;
	private String name;
	transient private int salary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return empId+" "+name+" "+salary;
	}
}
