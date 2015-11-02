package gr.teicm.icd.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import gr.teicm.icd.data.services.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	//Register User
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public String createUser()
	{
		return "create_user";
	}
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public String createUserPOST()
	{
		return "create_user";
	}
	
	//Login User
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginUser()
	{
		return "login_user";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String loginUserPOST()
	{
		return "login_user";
	}
	
	//Logout User
	@RequestMapping("/logout")
	public String logoutUser()
	{
		return "logout_user";
	}
	
	//Profile User
	@RequestMapping("/profile")
	public String profileUser()
	{
		return "profile_user";
	}
	
	//test show all users
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/find")
	public String find(Model model){
		model.addAttribute("users", this.userService.findAll());
		return "users";
	}
	
}
