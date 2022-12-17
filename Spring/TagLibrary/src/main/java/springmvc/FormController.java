package springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import sprimgmvc.model.Student;

@Controller
public class FormController {
	
	
	@RequestMapping("/home")
	public String send(Model model) {
		
		Student st=new Student();
		model.addAttribute("student", st);
		return "form";
	}
	
	@RequestMapping("/open")
	public String open(@ModelAttribute("student") Student student) {
		
		return "view";
	}
}
