package gr.teicm.icd.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import gr.teicm.icd.data.entities.User;
import gr.teicm.icd.data.services.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	//Register User
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String createUser()
	{
		return "register";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String createUserPOST(@ModelAttribute User user)
	{
		userService.insertUser(user);
		return "register";
	}
	
	//Login User
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginUser()
	{
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String loginUserPOST(@ModelAttribute User user)
	{
		return "login";
	}
	
	//Logout User
	@RequestMapping("/logout")
	public String logoutUser()
	{
		return "logout";
	}
	
	//Profile User
	@RequestMapping("/profile")
	public String profileUser()
	{
		return "profile";
	}
	
}
