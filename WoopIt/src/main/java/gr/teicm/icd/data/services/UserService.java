package gr.teicm.icd.data.services;

import java.util.*;

import gr.teicm.icd.data.entities.*;

public interface UserService {
    public void insertUser(User user);
    public void updateUser(User user);
    public List<User> listUsers();
    public User getUserById(Long id);
    public void removeUser(Long id);
}
