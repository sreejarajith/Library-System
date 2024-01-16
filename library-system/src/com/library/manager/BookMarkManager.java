package com.library.manager;

import com.library.dao.BookMarkDao;
import com.library.entities.Book;
import com.library.entities.BookMark;
import com.library.entities.Movie;
import com.library.entities.User;
import com.library.entities.UserBookMark;
import com.library.entities.Weblink;

public class BookMarkManager {
	private static BookMarkManager instance=new BookMarkManager();
	private static BookMarkDao bdao=new BookMarkDao();
	private BookMarkManager() {
	
	}
	public static BookMarkManager getInstance() {
		return instance;
	}
	public Movie createMovie( long id, String title,int releaseYear,String[]cast, String[]directors, String genre,double imdbRating) {
		Movie movie=new Movie();
		movie.setId(id);
		movie.setReleaseYear(releaseYear);
		movie.setCast(cast);
		movie.setDirectors(directors);
		movie.setTitle(title);
		movie.setGenre(genre);
		movie.setImdbRating(imdbRating);
		return movie;
	}
	
	public Book createBook(long id,String title,int publicationYear,String publisher,String[]authors, String genre,String amazonRating) {
		Book book=new Book();
		book.setTitle(title);
		book.setPublisher(publisher);
		book.setPublicationYear(publicationYear);
		book.setGenre(genre);
		book.setId(id);
		book.setAuthors(authors);
		book.setAmazonRating(amazonRating);
		return book;
	}


public Weblink createWebLink(long id, String title,String url,String host) {
	Weblink weblink = new Weblink();
	weblink.setId(id);
	weblink.setHost(host);
	weblink.setTitle(title);
	weblink.setUrl(url);
	return weblink;
}
public BookMark[][]getBookmark(){
	return bdao.getBookmark();
}
public void saveUserBookMark(User user, BookMark bookmark) {
	UserBookMark userbookmark=new UserBookMark();
	userbookmark.setUser(user);
	userbookmark.setBookMark(bookmark);
	bdao.saveUserBookMark(userbookmark);
}
}
