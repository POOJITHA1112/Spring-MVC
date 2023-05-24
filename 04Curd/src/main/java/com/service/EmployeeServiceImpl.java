  package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EmployeeDaoImpl;
import com.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

//	private static Logger lg=LoggerFactory.getLogger(EmployeeServiceImpl.class);
	
	@Autowired
	private EmployeeDaoImpl employeeDaoImpl;
	
	@Override
	public void save(Employee employee) {
//		lg.info("employee service impl save started" );
		employeeDaoImpl.save(employee);
//		lg.info("employee service impl ended" );

		
	}

	@Override
	public List<Employee> getAllEmployees() {
//		lg.info("employee service impl getAll started");
		return employeeDaoImpl.getAllEmployees();
	}

	

	@Override
	public void delete(int id) {
		employeeDaoImpl.delete(id);
		
	}

	@Override
	public Employee getByid(int id) {
		return employeeDaoImpl.getByid(id);
	}

	@Override
	public int getByName(String name) {
		return employeeDaoImpl.getByName(name);
	}

	@Override
	public void update(Employee employee) {
		employeeDaoImpl.update(employee);
		
	}

}
