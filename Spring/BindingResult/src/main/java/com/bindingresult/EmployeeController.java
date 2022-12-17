package com.bindingresult;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {
	
	@RequestMapping("/hello")
	public String get(Model m) {
		Employee emp=new Employee();
		
		m.addAttribute("emp", emp);
		String a=null;
		System.out.println(a.length());
		return "hello";
		
	}
	
	@RequestMapping("/open")

	public String open(@Valid @ModelAttribute("emp") Employee emp, BindingResult result) {
		String a=null;
		System.out.println(a.length());
		return "open";
	}
	
	@ExceptionHandler(value = Exception.class)
	public String nullPointer() {
		
		return "error";
	}

}
