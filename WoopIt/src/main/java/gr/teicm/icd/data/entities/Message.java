package gr.teicm.icd.data.entities;

public class Message {
	
	private String content;
	private User sender;
	
	public Message(){
		this.content = "";
		this.sender = new User();
	}

	public Message(String content, User sender) {
		this.content = content;
		this.sender = sender;
	}

	public String getContent() {
		return content;
	}

	public User getSender() {
		return sender;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setSender(User sender) {
		this.sender = sender;
	}
	
}
