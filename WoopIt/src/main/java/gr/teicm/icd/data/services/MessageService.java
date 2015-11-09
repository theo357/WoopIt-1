package gr.teicm.icd.data.services;

import java.util.List;

import gr.teicm.icd.data.entities.Message;

public interface MessageService {
	
	public void insertMessage(Message message);

	public List<Message> listMessages();
}
