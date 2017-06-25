package net.nitish.onlineshopping.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController
{
	@RequestMapping(value={"/","/home","/index"})
	public ModelAndView index()
	{
			ModelAndView mav = new ModelAndView("page");
			
			mav.addObject("message","Welcome to Online Shopping pvt. ltd.");
		
			return mav;
	}
}
