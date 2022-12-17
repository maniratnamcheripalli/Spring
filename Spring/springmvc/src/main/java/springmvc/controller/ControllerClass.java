package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerClass {
	
	@RequestMapping("/home")
	public String about() {
		return "index";
	}
	@RequestMapping("/index")
	public String send(Model model) {
		model.addAttribute("name", "ManiRatnam");
		model.addAttribute("company","Techouts");
		List<String> list=new ArrayList<String>();		
		list.add("Mani");
		list.add("Aruna");
		list.add("Srinivas");
		list.add("Vaishnavi");
		list.add("Omkar");		
		model.addAttribute("list", list);
		return "about";
	}
	@RequestMapping("/model")
	public ModelAndView get() {
		
		ModelAndView model=new ModelAndView();
		model.addObject("name", "Mani");
		model.addObject("id", 1955);
		model.setViewName("index");
		return model;
	}

}
