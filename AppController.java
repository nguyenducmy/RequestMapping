package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
	
	@RequestMapping(value="/")
	public String showpage(Model model) {
		
		model.addAttribute("msg","Springbooot application1 is :");
		return "index";
	}
	@RequestMapping(value="/info")   //  localhost:8080/info ,port 8080 
	public String showinfopage(Model model) {
		
		model.addAttribute("msg","Springbooot application1 is :");
		return "info";
	}
	
}
