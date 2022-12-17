package com.springCore.Jdbc;


import java.util.List;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class StudentDaoImp implements StudentDao {

	private JdbcTemplate jdbcTemplate;

	public int insert(Student student) {
		String query = "insert into student values(?,?,?)";
		int r = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getBranch());
		return r;
	}
	
	public int update(Student student) {
		String query1 = "update student set name=? , branch=? where id=?";
		int update = this.jdbcTemplate.update(query1,student.getName(), student.getBranch(),student.getId());
		return update;
	}
	public int delete(int studentId) {
		String query1 = "delete from student where id=?";
		int delete = this.jdbcTemplate.update(query1, studentId);
		return delete;
	}
	public Student read(int studentId) {
		String query="select * from student where id=?";
		
		RowMapper<Student> rowMapper=new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper,studentId);
		return student;
	}
	public List<Student> getAll() {
		String query="select * from student";
		jdbcTemplate.execute(query);
		List<Student> student =this.jdbcTemplate.query(query, new RowMapperImpl());
		return student;
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
}
