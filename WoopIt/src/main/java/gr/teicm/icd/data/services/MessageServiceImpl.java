package gr.teicm.icd.data.services;

import java.util.*;

import org.springframework.transaction.annotation.Transactional;

import gr.teicm.icd.dao.*;
import gr.teicm.icd.data.entities.*;

public class MessageServiceImpl implements MessageService{
	
	private MessageDAO messageDAO;

	@Override
	public void insertMessage(Message message) {
	    this.messageDAO.insertMessage(message);
	}

	@Override
	public List<Message> listMessages() {
		return this.messageDAO.listMessages();
	}
	
}
