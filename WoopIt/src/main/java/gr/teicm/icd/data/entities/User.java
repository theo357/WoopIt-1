package gr.teicm.icd.data.entities;

import java.util.Date;

public class User {
	
	private Long userId;
	private String userName;
	private String userPass;
	private Date userBirth;
	
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
	
	public Date getUserBirth(){
		return userBirth;
	}
	
	public void setUserBirth(Date userBirth){
		this.userBirth = userBirth;
	}
}
