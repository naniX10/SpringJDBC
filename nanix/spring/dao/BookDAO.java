package nanix.spring.dao;


import java.util.List;

import nanix.spring.vo.SungJuk;
import nanix.spring.vo.book;

public interface BookDAO {
	
	int insertBook(book b);

	List<book> selectAllBook();

	book selectOneBook(String bookid);
	
	int updateBook(book b);
	
	int deleteBook(String bookid);
}
