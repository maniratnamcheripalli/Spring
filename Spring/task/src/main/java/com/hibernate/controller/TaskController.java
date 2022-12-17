package com.hibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hibernate.model.Section;
import com.hibernate.model.Student;
import com.hibernate.service.TaskServise;


@Controller
public class TaskController {
	@Autowired
	private TaskServise taskService;
	
	@RequestMapping("/user")
	public String get() {
		return "section";
	}
	
	@RequestMapping(path = "/use",method = RequestMethod.POST)
	public String send1(@ModelAttribute Section section) {
		
		this.taskService.save(section);
		return "user";
		
	}
	
	@RequestMapping(path = "/student",method = RequestMethod.POST)
	public String send1(@RequestParam  @ModelAttribute Student student ) {
		
		this.taskService.create(student);
		return "view";
		
	}
	

}
