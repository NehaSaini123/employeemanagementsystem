package com.crudapplication.service;

import java.util.List;

import com.crudapplication.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmplyee();
	void saveEmployee(Employee employee);
	
	Employee getEmployeeById(long id);
	
	void deleteEmployee(long id);
}

