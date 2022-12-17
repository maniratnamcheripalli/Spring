package com.hibernate.dao;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hibernate.model.Section;
import com.hibernate.model.Student;


@Repository
public class TaskDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Transactional
	public int saveUser(Student student) {
		 int id =(Integer) this.hibernateTemplate.save(student);
		return id;
	}
	@Transactional
	public int save(Section section) {
		 int id =(Integer) this.hibernateTemplate.save(section);
			return id;
	}
	

}
