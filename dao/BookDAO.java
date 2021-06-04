package yh.spring.dao;

import java.util.List;

import yh.spring.vo.Book;

public interface BookDAO {

	int insertBook(Book b);
	List<Book> selectBook();
	Book selectOneBook(String bookid);
	int updateBook(Book b);
	int deleteBook(String bookid);
	
}
