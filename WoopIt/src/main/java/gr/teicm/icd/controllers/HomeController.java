package gr.teicm.icd.controllers;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import gr.teicm.icd.data.entities.Message;
import gr.teicm.icd.data.entities.User;

@Controller
public class HomeController {
	
	//List<Message> messages = new ArrayList<>();
	
	@RequestMapping("/home")
	public String goHome()
	{
		return "home";
	}
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String displayAllMessages(Model model)
	{
		//this.messages.add(newMessage);
		//this.messages.add(msg);
		//model.addAttribute("messages", messages);
		return "home";
	}
	
	@RequestMapping(value="/home", method=RequestMethod.POST)
	public String postMessage(@RequestParam("message") String msg, Model model)
	{
		Message newMessage = new Message();
		newMessage.setContent(msg);
		//model.addAttribute("message", newMessage);
		//this.messages.add(newMessage);
		model.addAttribute("messages", newMessage);
		return "home";
	}

}
