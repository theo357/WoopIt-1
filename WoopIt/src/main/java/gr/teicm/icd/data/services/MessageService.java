package gr.teicm.icd.data.services;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import gr.teicm.icd.dao.MessageDAO;
import gr.teicm.icd.data.entities.Message;

public class MessageService {

	
	public MessageService(){
		
	}
	
	public void insertMessage(Message message){
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
		MessageDAO messageDAO =  (MessageDAO) context.getBean("messageDAO");
		messageDAO.insertMessage(message);
	}
	
	public List<Message> getAllMessages(){
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
		MessageDAO messageDAO = (MessageDAO) context.getBean("messageDAO");
		return messageDAO.getAllMessages();
	}
}
