package hello.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/eMusicStore")
	public String test(ModelAndView modelAndView){
		return "home";
	}
	
}
