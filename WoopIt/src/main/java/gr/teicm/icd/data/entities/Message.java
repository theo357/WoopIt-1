package gr.teicm.icd.data.entities;

public class Message {
	
	private String content;
	private String time;
	private User sender;
	
	public Message(){
		this.content = "";
		this.time = "";
		this.sender = new User();
	}

	public Message(String content, String time, User sender) {
		this.content = content;
		this.time = time;
		this.sender = sender;
	}

	public String getContent() {
		return content;
	}

	public String getTime(){
		return this.time;
	}
	
	public User getSender() {
		return sender;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setTime(String time){
		this.time = time;
	}
	
	public void setSender(User sender) {
		this.sender = sender;
	}
	
}
