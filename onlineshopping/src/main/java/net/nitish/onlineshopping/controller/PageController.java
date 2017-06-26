package net.nitish.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.nitish.shoppingbackend.dao.CategoryDAO;
import net.nitish.shoppingbackend.dto.Category;

@Controller
public class PageController {
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView("page");
		mav.addObject("title", "Home");
		
		//passing the list of categories
		mav.addObject("categories", categoryDAO.list());
		
		mav.addObject("userClickHome", true);

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
	
	
	/*
	 *method to load all the products based on category 
	 * */
	
	@RequestMapping(value ="/show/all/products")
	public ModelAndView showAllProducts() {
		ModelAndView mav = new ModelAndView("page");
		mav.addObject("title", "All Products");
		
		//passing the list of categories
		mav.addObject("categories", categoryDAO.list());
		
		mav.addObject("userClickAllProducts", true);

		return mav;
	}

	@RequestMapping(value ="/show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable("id")int id) {
		ModelAndView mav = new ModelAndView("page");
	
		//categoryDAO to fetch a single category
		
		Category category = null;
		
		category = categoryDAO.get(id);
		
		mav.addObject("title", category.getName());
		
		//passing the list of categories
		mav.addObject("categories", categoryDAO.list());
		
		//passing the single category object
		mav.addObject("category", category);
		
		
		mav.addObject("userClickCategoryProducts", true);

		return mav;
	}
}
