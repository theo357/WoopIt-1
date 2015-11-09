package gr.teicm.icd.controllers;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import gr.teicm.icd.data.entities.Message;
import gr.teicm.icd.data.services.MessageService;;

@Controller
public class HomeController {
	
	private List<Message> allMessages = new ArrayList<>();
	
	private MessageService messageService;
	
    @Autowired(required=true)
    @Qualifier(value="messageService")
    public void setMessageService(MessageService ms){
        this.messageService = ms;
    }
	
	@RequestMapping("/home")
	public String goHome()
	{
		return "home";
	}
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String displayAllMessages(Model model)
	{
		this.allMessages = this.messageService.listMessages();
		//System.out.println(this.allMessages.get(0).getContent());
		model.addAttribute("allMessages", this.allMessages);
		return "home";
	}
	
	@RequestMapping(value="/home", method=RequestMethod.POST)
	public String postMessage(@RequestParam("message") String msg, Model model)
	{
		Message newMessage = new Message();
		newMessage.setBody(msg);
		
		this.messageService.insertMessage(newMessage);
		this.allMessages = this.messageService.listMessages();
		model.addAttribute("allMessages", this.allMessages);
		return "home";
	}

}
