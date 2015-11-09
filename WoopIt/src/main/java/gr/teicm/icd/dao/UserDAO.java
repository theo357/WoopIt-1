package gr.teicm.icd.dao;

import java.util.*;

import gr.teicm.icd.data.entities.*;

public interface UserDAO {
    
    public void insertUser(User user);
     
    public User getUserById(Long id);
    
    public Boolean checkIfUserNameExist(String userName);
    
    public void updateUser(User user);
    
    public List<User> listUsers();
    
    public void removeUser(Long id);
}