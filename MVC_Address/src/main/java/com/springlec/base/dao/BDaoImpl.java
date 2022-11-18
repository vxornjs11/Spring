package com.springlec.base.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.springlec.base.model.BDto;
import com.springlec.base.model.MovieBDto;

public class BDaoImpl implements BDao {
	
	SqlSession sqlSession;
	
	public static String nameSpace = "com.springlec.base.dao.BDao";

	@Override
	public List<BDto> listDao() throws Exception {
		
		return sqlSession.selectList(nameSpace + ".listDao");
	}

	@Override
	public List<BDto> queryDao(String query, String content) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(nameSpace + ".queryDao");
	}

	@Override
	public List<MovieBDto> mlistDao() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(nameSpace + ".mlistDao") ;
	}
	


	
	
	


}
