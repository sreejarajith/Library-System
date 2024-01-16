package com.library.datastore;

import com.library.controller.BookMarkController;
import com.library.entities.BookMark;
import com.library.entities.User;


public class View {
	public static void BookMark(User user, BookMark[][] bookmark) {
				System.out.println(user.getEmail()+" is Book marking");
				
		for( int i=0;i<DataStore.USER_BOOKMARK_LIMIT;i++) {
			for (int j=0; j<3; j++) {
			//int randomValue = (int)Math.random();
			
			int typeoffset=j;
			int bookmarkoffset=i;
			
			BookMark bookMark=bookmark[typeoffset][bookmarkoffset];
			
			BookMarkController.getinstance().saveUserBookMark( user, bookMark);
			System.out.println(bookMark);	
			}	
		}
	}
}


