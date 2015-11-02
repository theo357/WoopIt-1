package gr.teicm.icd.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import gr.teicm.icd.data.entities.User;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String goHome()
	{
		return "home";
	}

}
