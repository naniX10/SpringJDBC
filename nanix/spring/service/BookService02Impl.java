package nanix.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nanix.spring.dao.BookDAO;
import nanix.spring.vo.book;

@Service("bksrv02")
public class BookService02Impl implements BookService {

	@Autowired
	private BookDAO bkdao02;
	
	@Override
	public int newBook() {
		book b = new book("111", "스프링기초", "조아용", "5500");
		int cnt = bkdao02.insertBook(b);
		if (cnt>0) System.out.println("등록 완료!");
		return 0;
	}
		

	@Override
	public List<book> readBook() {
		StringBuffer sb = new StringBuffer();
		List<book> bs = bkdao02.selectAllBook();
		
		for (book b : bs) sb.append(b);
		
		System.out.println(sb.toString());
		
		return null;
	}

	@Override
	public book readOneBook() {
		book b = bkdao02.selectOneBook("111");
		System.out.println(b);
		
		return null;
	}

	@Override
	public void modifyBook(book b) {
		int cnt = bkdao02.updateBook(b);
		if (cnt>0) System.out.println("수정완료");
		
	}
	
	
	@Override
	public void removeBook(String bookid) {
		int cnt = bkdao02.deleteBook(bookid);
		if (cnt>0) System.out.println("제거 완료");
	}
	

	


}
