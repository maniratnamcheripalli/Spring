package com.springCore;

public class Student {
	
	private int id;
	private String name;
	private String state;

	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Student(int id, String name, String state) {
		super();
		this.id = id;
		this.name = name;
		this.state = state;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", state=" + state + "]";
	}	
}
