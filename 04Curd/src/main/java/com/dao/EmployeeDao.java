package com.dao;

import java.util.List;

import com.model.Employee;

public interface EmployeeDao {

	void save(Employee employee);

	List<Employee> getAllEmployees();

	void update(Employee employee);

	void delete(int id);

	Employee getByid(int id);

	int getByName(String name);

}
