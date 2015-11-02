package gr.teicm.icd.data.services;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import gr.teicm.icd.data.entities.User;

//MOCK - 3 users
public class UserService {
	
	private List<User> users = new LinkedList<>();
	
	public UserService(){
		User user1 = this.createUser(1L, "user1");
		User user2 = this.createUser(2L, "user2");
		User user3 = this.createUser(3L, "user3");
		
		this.users.addAll(Arrays.asList(new User[]{user1, user2, user3}));
	}
	
	public List<User> findAll(){
		return this.users;
	}
	
	public User find(Long userId){
		return this.users.stream().filter(p -> {
			return p.getUserId().equals(userId);
		}).collect(Collectors.toList()).get(0);
	}

	private User createUser(Long userId, String userName) {
		User user = new User();
		user.setUserId(userId);;
		user.setUserName(userName);
		user.setUserPass("pass");
		user.setUserBirth(null);
		return user;
	}
}
