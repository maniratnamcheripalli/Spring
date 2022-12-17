package mvcapplication;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class Test {
	
	@RequestMapping("/home")
	public String display() {
		System.out.println("hello");
		return "about";
	}
	
	@RequestMapping(path = "/application",method = RequestMethod.GET)
	public RedirectView display(@RequestParam("url") String url) {
		RedirectView r=new RedirectView();
		String query="https://www.google.co.in/search?="+url;
		r.setUrl(query);
		return r;
	}

}
