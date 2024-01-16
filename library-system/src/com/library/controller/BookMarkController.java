package com.library.controller;

import com.library.entities.BookMark;
import com.library.entities.User;
import com.library.manager.BookMarkManager;

public class BookMarkController {
	public static BookMarkController instance=new BookMarkController();
	BookMarkController(){}
public static BookMarkController getinstance() {
	return  instance;
}
public void saveUserBookMark(User user ,BookMark bookmark) {
	BookMarkManager.getInstance().saveUserBookMark(user,bookmark);
}


}
