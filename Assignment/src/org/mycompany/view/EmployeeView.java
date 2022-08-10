package org.mycompany.view;
import org.mycompany.model.Employee;
import org.mycompany.service.EmployeeService;
public class EmployeeView {

	

	public static void main(String[] args) {
		Employee Employee1 = new Employee(20,'S',50000);
		EmployeeService Employee = new EmployeeService();
		EmployeeService employeeservice = new EmployeeService();
		Employee updateEmployee = Employee.calculateSalaryIncrement(Employee1);
		System.out.println("Employee Id : " + updateEmployee.getEmployeeId());
		System.out.println("Employee Initial : " + updateEmployee.getEmployeeInitial());
		System.out.println("Updated Salary : " + updateEmployee.getEmployeeSalary());
	}
}
