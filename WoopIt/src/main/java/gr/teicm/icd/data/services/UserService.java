package gr.teicm.icd.data.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import gr.teicm.icd.dao.UserDAO;
import gr.teicm.icd.data.entities.User;

//MOCK - 3 users
public class UserService {
	
	public UserService(){

	}
	
	public void insertUser(User user){
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
    	UserDAO userDAO = (UserDAO) context.getBean("userDAO");
    	
    	// Check if the username already exist in the DB
    	if(userDAO.checkIfUserNameExist(user.getUserName())==false)
    		userDAO.insert(user);
    	else
    		System.out.println("user already exist");
	}
}
