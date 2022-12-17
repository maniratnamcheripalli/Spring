package com.collections;

public class Print {
	
	private int id;
	private Employee emp;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	@Override
	public String toString() {
		return "Print [id=" + id + ", emp=" + emp + "]";
	}
	

}
