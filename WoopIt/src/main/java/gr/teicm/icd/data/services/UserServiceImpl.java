package gr.teicm.icd.data.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import gr.teicm.icd.data.entities.*;
import gr.teicm.icd.dao.*;
import gr.teicm.icd.dao.impl.*;


public class UserServiceImpl implements UserService{
    
    private UserDAO userDAO;
    
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
	
	@Override
	@Transactional
    public void insertUser(User user){
    	this.userDAO.insertUser(user);
    }
    
	@Override
	@Transactional
	public void updateUser(User user){
    	this.userDAO.updateUser(user);
    }
    
	@Override
	@Transactional
	public List<User> listUsers(){
    	return this.userDAO.listUsers();
    }
    
	@Override
	@Transactional
	public User getUserById(Long id){
    	return this.userDAO.getUserById(id);
    }
    
	@Override
	@Transactional
	public void removeUser(Long id){
    	this.userDAO.removeUser(id);
    }

}
