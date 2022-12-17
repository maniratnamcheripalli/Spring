package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ApplicationController {
	
	@RequestMapping("/home1")
	public String display() {
		return "application";
	}
	
	@RequestMapping(path = "/search",method = RequestMethod.GET)
	public RedirectView display(@RequestParam("url") String url) {
		RedirectView r=new RedirectView();
		String query="https://www.google.co.in/search?q="+ url;
		r.setUrl(query);
		return r;
	}
}
