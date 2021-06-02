package nanix.spring.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import nanix.spring.vo.book;

@Repository("bkdao02")
public class BookDAO02Impl implements BookDAO {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int insertBook(book b) {
		
		return sqlSession.insert("book.insertBook", b);
	}

	@Override
	public List<book> selectAllBook() {
		
		return sqlSession.selectList("book.selectBook");
	}

	@Override
	public book selectOneBook(String bookid) {
		
		return sqlSession.selectOne("book.selectOneBook",bookid);
	}

	@Override
	public int updateBook(book b) {
		return sqlSession.update("book.updateBook",b);

	}

	@Override
	public int deleteBook(String bookid) {
		
		return sqlSession.delete("book.deleteBook",bookid);

	}

}
