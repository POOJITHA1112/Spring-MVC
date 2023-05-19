package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@RequestMapping("/home")
@RequestMapping
public class HomeController {

	@RequestMapping(value = "/msg")
	public String loadmsg() {
		return "message";
	}

	@RequestMapping(value = "/msg/message", method = RequestMethod.GET)
	public String executemsg(@RequestParam(name = "ukku") String name) {
		System.out.println(name);
		return "welcome";
	}

//	DispatcherServlet
}
