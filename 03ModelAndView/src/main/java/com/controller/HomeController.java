package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.model.Employee;

@Controller
@RequestMapping
public class HomeController {

	@RequestMapping(value = "/load")
	public String loadEmp() {
		return "emp-save";
	}
	
//	@RequestMapping(value = "/load/save",method = RequestMethod.GET)
//	public String executeEMp(@RequestParam String id,@RequestParam String name,@RequestParam String salary) {
//		return "emp-list";
//	}
	
	
//	@RequestMapping(value = "/load/save",method = RequestMethod.POST)
//	public ModelAndView executeEmp(Employee employee) {
//		ModelAndView modelAndView=new ModelAndView();
//		modelAndView.addObject("emp", employee);
//		modelAndView.setViewName("emp-list");
//		return modelAndView ;
//	}
	
	@RequestMapping(value ="/load/save",method = RequestMethod.POST)
	public ModelAndView executeEmp(Employee employee,BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
		return new ModelAndView("emp-save");
	}
	
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("emp", employee);
		modelAndView.setViewName("emp-list");
		return modelAndView;
	
	}

	
}