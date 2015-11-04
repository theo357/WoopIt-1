package gr.teicm.icd.data.entities;

import java.util.Date;
//model
public class User {
	
	private Long userId;
	private String userName;
	private String userPass;

	public Long getUserId(){
		return userId;
	}
	
	public void setUserId(Long userId){
		this.userId = userId;
	}
	
	public String getUserName(){
		return userName;
	}
	
	public void setUserName(String userName){
		this.userName = userName;
	}
	
	public String getUserPass(){
		return userPass;
	}
	
	public void setUserPass(String userPass){
		this.userPass = userPass;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPass=" + userPass + "]";
	}
	
}
