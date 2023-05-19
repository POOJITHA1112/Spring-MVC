package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

	@RequestMapping(value = "/hi")
	public String home() {
//		return "/WEB-INF/views/home.jsp";
		System.out.println("kiiiiiiiiiiiiiiiiiiiiiiii");
		return "home";
	}

	@RequestMapping(value = "hello")
	public String about() {
//		return "/WEB-INF/views/about.jsp";
		return "about";
	}
//	InternalResourceViewResolver

}
