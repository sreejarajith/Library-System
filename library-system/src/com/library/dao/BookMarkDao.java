package com.library.dao;

import com.library.datastore.DataStore;
import com.library.entities.BookMark;
import com.library.entities.UserBookMark;

public class BookMarkDao {
	public  BookMark[][] getBookmark(){
		return DataStore.getBookmark();
	}

	public void saveUserBookMark(UserBookMark userbookmark) {
		DataStore.add(userbookmark);
		
	}

}
