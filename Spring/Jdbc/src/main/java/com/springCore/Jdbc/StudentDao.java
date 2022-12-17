package com.springCore.Jdbc;

import java.util.List;

public interface StudentDao {
	
	public int insert(Student student);
	
	public int update(Student student);
	
	public int delete(int studentId);
	
	public Student read(int studentId);
	
	public List<Student> getAll();

}
