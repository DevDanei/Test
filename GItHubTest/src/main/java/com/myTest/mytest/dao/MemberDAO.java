package com.myTest.mytest.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myTest.mytest.vo.Member;

@Repository
public class MemberDAO {

	@Autowired
	SqlSession session;
	
	public Member SelectMember(Member member) {
		Member result = null;
		
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		try {
			result = mapper.selectMember(member);
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return result;
	}
	
	
	
}
