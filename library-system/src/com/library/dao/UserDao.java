package com.library.dao;

import com.library.datastore.DataStore;
import com.library.entities.User;

public class UserDao {
	public User[]getUsers(){
		return DataStore.getUsers();
	}

}
