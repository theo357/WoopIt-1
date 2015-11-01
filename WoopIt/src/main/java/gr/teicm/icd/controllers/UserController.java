package gr.teicm.icd.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("/create")
	public String createUser()
	{
		return "create_user";
	}
	
	@RequestMapping("/login")
	public String loginUser()
	{
		return "login_user";
	}
	
	@RequestMapping("/logout")
	public String logoutUser()
	{
		return "logout_user";
	}
	
	@RequestMapping("/profile")
	public String profileUser()
	{
		return "profile_user";
	}
	
}
