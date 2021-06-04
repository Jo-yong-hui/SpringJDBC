package yh.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import yh.spring.vo.Member;


@Repository("mdao02")
public class MemberDAO02Impl implements MemberDAO {

	@Autowired
	private SqlSession sqlSession;	
	
	
	@Override
	public void insertMember(Member m) {
		int cnt =sqlSession.insert("member.insertMember",m);
		if (cnt > 0) System.out.println("회원 추가 완료!");	
	}
	
	@Override
	public List<Member> selectAllMember() {
	 return sqlSession.selectList("member.selectMember");
	
		
	}

	
	@Override
	public Member selectOneMember(int mno) {
		return sqlSession.selectOne(
				"member.selectOneMember",mno);
	}
	

	@Override
	public void updateMember(Member m) {
		int cnt = sqlSession.update("member.updateMember", m);
		if (cnt > 0) System.out.println("회원 수정완료!");	

	}
	
	@Override
	public void deleteMember(int mno) {
		int cnt = sqlSession.delete("member.deleteMember", mno);
		if (cnt > 0) System.out.println("회원 삭제완료!");
	
	}

}
