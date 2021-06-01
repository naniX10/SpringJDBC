package nanix.spring.dao;


import java.util.List;

import nanix.spring.vo.Member;


public interface MemberDAO {
	
	void insertMember(Member m);

	List<Member> selectAllMember();

	Member selectOneMember(int mno);
	
	void updateMember(Member m);
	
	void deleteMember(int mno);
}
