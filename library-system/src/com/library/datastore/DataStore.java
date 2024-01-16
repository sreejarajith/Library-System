package com.library.datastore;

import com.library.constants.BookGenre;
import com.library.constants.MovieGenre;
import com.library.entities.BookMark;
import com.library.entities.User;
import com.library.entities.UserBookMark;
import com.library.manager.BookMarkManager;
import com.library.manager.UserManager;

public class DataStore {
	public static final  int USER_BOOKMARK_LIMIT=5;
	public static final  int BOOKMARK_COUNT_PER_TYPE=5;
	public static final  int BOOKMARK_TYPE_COUNT=3;
	public static final  int TOTAL_USER_COUNT=5;
	
	private static User[] user = new User[TOTAL_USER_COUNT];
	public static User[] getUsers() {
		return user;
	}
	private static BookMark[][] bookmark = new BookMark[BOOKMARK_TYPE_COUNT][ BOOKMARK_COUNT_PER_TYPE];
	  public static BookMark[][] getBookmark() {
		return bookmark;
	}
	public static UserBookMark[] userbookmarks = new UserBookMark[TOTAL_USER_COUNT * BOOKMARK_TYPE_COUNT];
	private static int bookmarkIndex;
	public static void loadData() {
		loadUser();
		loadWebLink();
		loadMovies();
		loadBooks();
	}
	/*
	 * private static User[] users=new User[TOTAL_USER_COUNT] { public static
	 * User[].getusers(); return users;
	 */
			
	

public static void loadUser() {
	user[0]=UserManager.getInstance().createUser(1000,"user0@semanticsquare.com","test","John","M",0,"user"	);
	user[1]=UserManager.getInstance().createUser(1001,"user1@semanticsquare.com","test","Sam",	"M",0,"user");
	user[2]=UserManager.getInstance().createUser(1002,"user2@semanticsquare.com"	,"test","Anita","M",0,"editor");
	user[3]=UserManager.getInstance().createUser(1003,"user3@semanticsquare.com","test","Sara",	"M",1,"editor");
	user[4]=UserManager.getInstance().createUser(1004,"user4@semanticsquare.com","test","Dheeru","M",0,"chiefeditor");
}
public static void loadWebLink() {
	bookmark[0][0]=BookMarkManager.getInstance().createWebLink(2000,"Taming Tiger Part 2","http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html","http://www.javaworld.com");	
	bookmark[0][1]=BookMarkManager.getInstance().createWebLink(2001,"How do I import a pre-existing Java project into Eclipse and get up and running?","http://stackoverflow.com/questions/142863/how-do-i-import-a-pre-existing-java-project-into-eclipse-and-get-up-and-running","http://www.stackoverflow.com");	
	bookmark[0][2]=BookMarkManager.getInstance().createWebLink(2002,"Interface vs Abstract Class","http://mindprod.com/jgloss/interfacevsabstract.html","http://mindprod.com");
	bookmark[0][3]=BookMarkManager.getInstance().createWebLink(2003,"NIO tutorial by Greg Travis","http://cs.brown.edu/courses/cs161/papers/j-nio-ltr.pdf","http://cs.brown.edu	unknown");
	bookmark[0][4]=BookMarkManager.getInstance().createWebLink(2004,"Virtual Hosting and Tomcat","http://tomcat.apache.org/tomcat-6.0-doc/virtual-hosting-howto.html","http://tomcat.apache.org");
}
public static void loadMovies() {
	bookmark[1][0]=BookMarkManager.getInstance().createMovie(3000,"Citizen Kane",1941,new String[]{"Orson Welles","Joseph Cotten"},new String[] {"Orson Welles"}, MovieGenre.CLASSICS,8.5);	//gonre.classic
	bookmark[1][1]=BookMarkManager.getInstance().createMovie(3001,"The Grapes of Wrath",1940,new String[]{"Henry Fonda","Jane Darwell"},new String[] {"John Ford"},MovieGenre.CLASSICS,8.2);
	bookmark[1][2]=BookMarkManager.getInstance().createMovie(3002,"A Touch of Greatness",2004,new String[]{"Albert Cullum","Leslie"},new String[]{"ullivan"},MovieGenre.CLASSICS,7.3);	
	bookmark[1][3]=BookMarkManager.getInstance().createMovie(3003,"The Big Bang Theory",2007,new String[]{"Kaley Cuoco","Jim Parsons"},new String[]{"Chuck Lorre","Bill Prady"},MovieGenre.TV_SHOWS,8.7);	
	bookmark[1][4]=BookMarkManager.getInstance().createMovie(3004,"Ikiru",1952,new String[]{"Takashi Shimura","Minoru Chiaki"},new String[]{"Akira Kurosawa"},MovieGenre.FOREIGN_MOVIES,8.4);	
}
public static void loadBooks() {
	bookmark[2][0]=BookMarkManager.getInstance().createBook(4000,"Walden",1854,"Wilder Publications",new String[]{"Henry David Thoreau"},BookGenre.PHILOSOPHY,"4.3");
	bookmark[2][1]=BookMarkManager.getInstance().createBook(4001,"Self-Reliance and Other Essays",1993,	"Dover Publications",new String[]{"Ralph Waldo Emerson"},BookGenre.PHILOSOPHY,"4.5");
	bookmark[2][2]=BookMarkManager.getInstance().createBook(4002,"ight From Many Lamps",1988,"Touchstone",new String[] {"Lillian Eichler"," Watson"},BookGenre.PHILOSOPHY,"5.0");
	bookmark[2][3]=BookMarkManager.getInstance().createBook(4003,"Head First Design Patterns",2004,	"O'Reilly Media",new String[]{"Eric Freeman,Bert Bates,Kathy Sierra,Elisabeth Robson"},BookGenre.TECHNICAL,"4.5");	
	bookmark[2][4]=BookMarkManager.getInstance().createBook(4004,"Effective Java Programming Language Guide",2007,"Prentice Hall",new String[]{"Joshua Bloch"},BookGenre.TECHNICAL,"4.9");	
}



public static void add(UserBookMark userbookmark) {
	// TODO Auto-generated method stub
	
}



/*
 * public static void add(UserBookMark userbookmark ) {
 * 
 * userbookmarks[bookmarkIndex]=userbookmark ; bookmarkIndex++; }
 */
	
	
}



