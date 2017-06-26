package net.nitish.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView("page");

		mav.addObject("userClickHome", true);
		mav.addObject("title", "Home");

		return mav;
	}
	
	@RequestMapping(value ="/about")
	public ModelAndView about() {
		ModelAndView mav = new ModelAndView("page");

		mav.addObject("userClickAbout", true);
		mav.addObject("title", "About Us");

		return mav;
	}
	
	@RequestMapping(value ="/contact")
	public ModelAndView contact() {
		ModelAndView mav = new ModelAndView("page");

		mav.addObject("userClickContact", true);
		mav.addObject("title", "Contact Us");

		return mav;
	}
	
}
