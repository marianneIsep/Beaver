package com.springapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {


	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world! It works ?");
		return "hello";
	}

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String tet(ModelMap model) {
		model.addAttribute("message", "tetst");
		return "hello";
	}

}