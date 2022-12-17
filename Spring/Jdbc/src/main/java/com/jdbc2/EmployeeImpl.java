package com.jdbc2;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeImpl implements EmployeeDao{
	
	private JdbcTemplate jdbcTemplete;

	public int insert(Employee emp) {
		String query="insert into employee values(?,?,?,?)";
		int insert = this.jdbcTemplete.update(query,emp.getId(),emp.getName(),emp.getPosition(),emp.getCompany());
		return insert;
	}

	public int update(Employee emp) {
		String query="update employee set name=?, company=? where id=?";
		int update = this.jdbcTemplete.update(query,emp.getName(),emp.getCompany(),emp.getId());
		return update;
	}
	public Employee read(int id) {
		String query="select * from employee where id=?";
		RowMapper<Employee> emp=new RowMapperImpl();
		Employee queryForObject = this.jdbcTemplete.queryForObject(query, emp,id);
		return queryForObject;
	}

	public List<Employee> getAll() {
		String query="select * from employee";
		RowMapper<Employee> emp=new RowMapperImpl();
		List<Employee> queryForObject = this.jdbcTemplete.query(query, emp);
		return queryForObject;
	}

	public int delete(int id) {
		
		String query="delete from employee where id=?";
		
		int delete = this.jdbcTemplete.update(query,id);
		return delete;
	}

	public JdbcTemplate getJdbcTemplete() {
		return jdbcTemplete;
	}

	public void setJdbcTemplete(JdbcTemplate jdbcTemplete) {
		this.jdbcTemplete = jdbcTemplete;
	}
	
}
