package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

//	private static  Logger lg=LoggerFactory.getLogger(EmployeeDaoImpl.class);
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void save(Employee employee) {
//		lg.info("daoimpl method started");
		int result = jdbcTemplate.update("insert into employee values(?,?,?,?)", new Object[] {employee.getId(),employee.getName(),employee.getSalary(),employee.getEmail()});
		System.out.println(result);
		System.out.println("daoimpl method ended");
	}

	@Override
	public List<Employee> getAllEmployees() {
		BeanPropertyRowMapper<Employee>beanPropertyRowMapper=new BeanPropertyRowMapper<>(Employee.class);
		 List<Employee> list = jdbcTemplate.query("select * from  employee",beanPropertyRowMapper);
		 return list;
	}

	@Override
	public void update(Employee employee) {
		String query="update employee set name=?,salary=?,email=? where id=?";
		int update = jdbcTemplate.update(query, new Object[] {employee.getName(),employee.getSalary(),employee.getEmail(),employee.getId()});
		System.out.println(update);
	}

	@Override
	public void delete(int id) {
		String query="delete from employee where id=?";
		int delete = jdbcTemplate.update(query,new Object[] {id});
		System.out.println(delete);
		
	}

	@Override
	public Employee getByid(int id) {
		String query1="select * from employee where id=?";
 		 return  jdbcTemplate.queryForObject(query1, new BeanPropertyRowMapper<>(Employee.class), id);
		
	}

	@Override
	public int getByName(String name) {
		String query="select * from employee where name=?";
		int i = jdbcTemplate.update(query, new Object[] {name});
		return i;
	}
	

}
