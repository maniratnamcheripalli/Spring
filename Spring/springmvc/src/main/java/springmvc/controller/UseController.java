package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;


@Controller
public class UseController {
	
	
	@Autowired
	private UserService userService;

	
	@RequestMapping("/user")
	public String get() {
		return "user";
	}
	
	//1st approach

//@RequestMapping(path = "/use",method = RequestMethod.POST)
//	
//	public String send(@RequestParam("email") String email ,@RequestParam("name") String name, Model model) {
//	
//	model.addAttribute("name", name);
//	model.addAttribute("email", email);
//		return "view";
//		
//	}
	
	
	//2nd approach
	@RequestMapping(path = "/use",method = RequestMethod.POST)
	public String send1(@ModelAttribute("user") User user) {
		
		this.userService.create(user);
		return "view";
		
	}
	

}
