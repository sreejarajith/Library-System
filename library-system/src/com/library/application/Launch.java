package com.library.application;

import com.library.datastore.DataStore;
import com.library.datastore.View;
import com.library.entities.BookMark;
import com.library.entities.User;
import com.library.manager.BookMarkManager;
import com.library.manager.UserManager;

public class Launch {
	private static User[] users;
	private static BookMark[][] bookmark;

	private static void loadData() {
		System.out.println("1. Loading data...");
		DataStore.loadData();
		users = UserManager.getInstance().getUsers();
		bookmark = BookMarkManager.getInstance().getBookmark();
		System.out.println("2. Printing data...");
		printuserData();
		printBookMarkData();
	}

	private static void printBookMarkData() {
	for(BookMark[] bookmarks:bookmark) {
		for (BookMark bookMark : bookmarks) {
			System.out.println(bookMark);
			
		}
	}
	System.out.println();
	}

	private static void printuserData() {
		for (User user : users) {
			System.out.println(user);
		}

	}
	private static void startBookMarking() {
		System.out.println("2.BookMarking...");
		for(User user:users) {
			View.BookMark(user,bookmark);
		}
		
	}
	public static void main(String[] args) {
		loadData();
		startBookMarking();
	}

	

}
