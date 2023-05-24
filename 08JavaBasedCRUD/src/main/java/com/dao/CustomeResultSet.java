package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.model.Employee;

public class CustomeResultSet implements ResultSetExtractor<List<Employee>> {

	@Override
	public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
		
		List<Employee>list=new  ArrayList<>();
		while(rs.next()) {
			Employee e=new Employee();
			e.setId(rs.getInt(1));
			e.setName(rs.getString(2));
			e.setSalary(rs.getDouble(3));
			e.setEmail(rs.getString(4));
			list.add(e);
		}
		
		return list;
	}

}
