package com.test.bnna.member.board.blackboard;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BlackBoardCmtDAO implements IBlackBoardCmtDAO {

	@Autowired
	SqlSessionTemplate template;
	
	@Override
	public int add(BlackBoardCmtDTO dto) {

		return template.insert("blackboardcmt.add", dto);
	}
	
	@Override
	public BlackBoardCmtDTO getAddCmt() {
		
		return template.selectOne("blackboardcmt.getAddCmt");
	}
	
}
