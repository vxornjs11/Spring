package com.springlec.base.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.springlec.base.model.BDto;

public class BDaoImpl implements BDao {
	
	
	@Autowired
	SqlSession sqlSession;
	
	public static String nameSpace = "com.springlec.base.dao.BDao";
	
	@Override
	public List<BDto> listDao() throws Exception {
		
		return sqlSession.selectList(nameSpace + ".listDao");
	}

}
