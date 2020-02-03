package com.jspiders.pkg1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("home")
	public String laila()
	{
		ModelAndView mav=new ModelAndView("home");
		System.out.println("hellooooooo");
		return "home";
	}
	

}
