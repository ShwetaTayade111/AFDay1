package org.mycompany.model;

public class Employee {
	private int employeeId;
	public Employee(int iId, char initial, int salary) {
		super();
		employeeId =iId;
	employeeInitial =initial;
	employeeSalary = salary;
	}
	private char employeeInitial;
	private int employeeSalary;
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public char getEmployeeInitial() {
		return employeeInitial;
	}
	public void setEmployeeInitial(char employeeInitial) {
		this.employeeInitial = employeeInitial;
	}
	public int getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
}
	
	