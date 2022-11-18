package com.springlec.base.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.springlec.base.model.BDto;

public class BDaoImpl implements BDaoDao {
	
	SqlSession sqlSession;
	
	public static String nameSpace = "com.springlec.base.dao.BDaoDao";

	@Override
	public List<BDto> listDao() throws Exception {
		
		
		return sqlSession.selectList(nameSpace + ".listDao") ;
	}

}
