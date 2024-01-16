package com.library.manager;

import com.library.dao.UserDao;
import com.library.entities.User;

public class UserManager {
private static UserManager instance=new UserManager();
private static UserDao dao=new UserDao();
private UserManager() {
	
}
public static UserManager getInstance() {
	return instance;
	
}
public User createUser(long id,String email,String password,String firstname,String lastName,int gender,String userType) {
	User user=new User();
	user.setId(id);
	user.setPassword(password);
	user.setEmail(email);
	user.setFirstName(firstname);
	user.setLastName(lastName);
	user.setGender(gender);
	user.setUserType(userType);
	
	return user;
	
	
}
public User[] getUsers() {
	return dao.getUsers();
	
}

}
