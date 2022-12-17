package com.jdbc2;

import java.util.List;

public interface EmployeeDao {
	
	public int insert(Employee emp);
	
	public int update(Employee emp);
	
	public Employee read(int id);
	
	public List<Employee> getAll();
	
	public int delete(int id);

}
