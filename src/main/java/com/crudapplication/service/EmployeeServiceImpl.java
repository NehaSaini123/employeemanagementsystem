package com.crudapplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudapplication.model.Employee;
import com.crudapplication.repository.EmployeeRepository;


@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getAllEmplyee(){
	   return employeeRepository.findAll();
	}

	@Override
	public void saveEmployee(Employee employee){
		this.employeeRepository.save(employee);		
	}


	@Override
	public Employee getEmployeeById(long id) {
		 Optional<Employee> optional =employeeRepository.findById(id);               
		    Employee employee = null;
		    if(optional.isPresent()){
		    	 employee = optional.get();
		    } else {
		   	     throw new RuntimeException("Employee not found for id ::"+ id);
		       }
		   return employee;	
	}
	
	public void deleteEmployee(long id) {
		this.employeeRepository.deleteById(id);
	  
	}
	
}