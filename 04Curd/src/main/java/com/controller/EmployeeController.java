 package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.model.Employee;
import com.service.EmployeeServiceImpl;

@Controller
@RequestMapping
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;
	
	
	@RequestMapping(value = "/home",method = RequestMethod.GET)
	public String home() {
		return "emp-save";
	}
	
//	@PostMapping("/save")
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public String saveEmp(@ModelAttribute("employee1")Employee employee) {
		employeeServiceImpl.save(employee); 
		return "redirect:/listemp";
	
	}
	 
	@GetMapping(value = "/listemp")
	public ModelAndView getAllEmps() {
		return new ModelAndView("emp-list", "emps", employeeServiceImpl.getAllEmployees());
	}
	
	
	@GetMapping("/deleteEmp")
     public String delete(@RequestParam("id")int id) {
    	 employeeServiceImpl.delete(id);
    	 return "redirect:/listemp";
     }
	
	@GetMapping("/updateEmp")
	public ModelAndView update(@RequestParam("id") int id,Employee emp) {
		employeeServiceImpl.getByid(id);
		ModelAndView modelAndView=new ModelAndView("emp-update");
		modelAndView.addObject(emp);
		return modelAndView;
	}
	
	
	@PostMapping("/update")
	public String update(@ModelAttribute("employee1")Employee e) {
		employeeServiceImpl.update(e);
		return "redirect:/listemp";     
	}
	
	
}
