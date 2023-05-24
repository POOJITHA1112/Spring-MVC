package com.service;

import java.util.List;

import com.model.Employee;

public interface EmployeeService {

	void save(Employee employee);
	List<Employee>getAllEmployees();
	void update(Employee employee);
	void delete(int id);
	public Employee getByid(int id);
	int getByName(String name);

	
}
