package nanix.spring.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import nanix.spring.vo.SungJuk;

@Repository("sjdao02")
public class SungJukDAO02Impl implements SungJukDAO {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public void insertSungJuk(SungJuk sj) {
		int cnt = sqlSession.insert("sungjuk.insertSungjuk",sj);
		if (cnt > 0) System.out.println("회원 등록 성공");
		
	} // DB에 성적 추가? ("xml의 namespace명.id",)

	@Override
	public List<SungJuk> selectAllSungJuk() {
		return sqlSession.selectList("sungjuk.selectSungjuk");
	}

	

	@Override
	public SungJuk selectOneSungJuk(int sjno) {
		return sqlSession.selectOne("sungjuk.selectOneSungjuk", sjno);
	}	
	
		
	
	
	@Override
	public void updateSungJuk(SungJuk sj) {
		int cnt = sqlSession.update("sungjuk.updateSungjuk",sj);
		if (cnt > 0) System.out.println("수정완료!");
	}

	
	@Override
	public void deleteSungJuk(int sjno) {
		int cnt = sqlSession.delete("sungjuk.deleteSungjuk",sjno);
		if (cnt > 0) System.out.println("제거 완료!");
		
	}
	
}
