package com.collections;

import java.util.List;
import java.util.Properties;
import java.util.Set;

public class Employee {
	
	private String name;
	
	private List<String> list;
	
	private Set<String> set;
	
	private Properties props;

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public Employee(String name, List<String> list, Set<String> set) {
		super();
		this.name = name;
		this.list = list;
		this.set = set;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", list=" + list + ", set=" + set + "]";
	}
	
	
	
}
