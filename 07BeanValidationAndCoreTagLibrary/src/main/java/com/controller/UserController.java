package com.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.bean.User;

@Controller
public class UserController {

	
	@GetMapping("/register")
	public String loadUser(@ModelAttribute User user, Model model) {
		Map<String, String> roles = new HashMap<>();
		roles.put("ad", "Admin");
		roles.put("DBA", "dba");
		roles.put("TL", "techincl lead");
		model.addAttribute("roles", roles);
		System.out.println("1");
		return "userform";
	}
	
	

	@PostMapping("/register")
//	@RequestMapping(value = "/add",method = RequestMethod.POST)
	public String regUser(@Valid @ModelAttribute User user, BindingResult result,
			RedirectAttributes redirectAttributes) {
		if (result.hasErrors()) {
			System.out.println("3");
			return "userform";
		}
		System.out.println("4");
		redirectAttributes.addFlashAttribute("user", user);
		return "redirect:/userdetails";
	}
	
	@GetMapping("/userdetails")
	public String success() {
		System.out.println("2");
		return "details-user";
	}

	

}
