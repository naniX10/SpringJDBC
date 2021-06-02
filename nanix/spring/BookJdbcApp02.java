package nanix.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import nanix.spring.service.BookService;
import nanix.spring.vo.book;

public class BookJdbcApp02 {

	public static void main(String[] args) {
		ApplicationContext ctx =
				new ClassPathXmlApplicationContext("springjdbc02.xml");
		BookService bksrv = (BookService) ctx.getBean("bksrv02");

		
		// 책 등록
		//bksrv.newBook();
		// 책 조회
		//bksrv.readBook();
		// 책 상세조회
		//bksrv.readOneBook();
		// 책 정보 수정
		//book b = new book("112", "sql기초", "시러용", "25000");
		//bksrv.modifyBook(b);
		// 책 삭제
		bksrv.removeBook(112);
	}

}
