package com.hibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernate.dao.TaskDao;
import com.hibernate.model.Section;
import com.hibernate.model.Student;


@Service
public class TaskServise {
	
	@Autowired
	private TaskDao taskDao;

	public int create(Student student) {
		return this.taskDao.saveUser(student);

	}

	public int save(Section section) {
		return this.taskDao.save(section);
		
	}

}
