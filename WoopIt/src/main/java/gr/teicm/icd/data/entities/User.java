package gr.teicm.icd.data.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER")
public class User {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long userId;
	private String userName;
	private String userPass;
	private String userEmail;
	private String userSex;
	private String userCountry;
	
	public long getUserId(){
		return userId;
	}
	public void setUserId(int userId){
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

	public String getUserEmail(){
		return userEmail;
	}
	public void setUserEmail(String userEmail){
		this.userEmail = userEmail;
	}
	
	public String getUserSex(){
		return userSex;
	}
	public void setUserSex(String userSex){
		this.userSex = userSex;
	}
	
	public String getUserCountry(){
		return userCountry;
	}
	public void setUserCountry(String userCountry){
		this.userCountry = userCountry;
	}
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPass=" + userPass + ", userEmail="
				+ userEmail + ", userSex=" + userSex + ", userCountry=" + userCountry + "]";
	}
	

}
