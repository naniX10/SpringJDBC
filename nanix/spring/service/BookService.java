package nanix.spring.service;

import java.util.List;

import nanix.spring.vo.book;

public interface BookService {
	
	int newBook();

	List<book> readBook();

	book readOneBook();
	
	void modifyBook(book b);
		
	void removeBook(String bookid);
}
