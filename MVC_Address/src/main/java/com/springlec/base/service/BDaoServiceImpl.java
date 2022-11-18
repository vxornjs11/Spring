package com.springlec.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springlec.base.dao.BDao;
import com.springlec.base.model.BDto;
import com.springlec.base.model.MovieBDto;


@Service
public class BDaoServiceImpl implements BDaoService {
	
	
	
	@Autowired
	BDao dao;
	
	@Override
	public List<BDto> listDao() throws Exception {
		return dao.listDao();
	}

	@Override
	public List<BDto> queryDao(String query, String content) throws Exception {
		// TODO Auto-generated method stub
		content = '%' + content + '%';
		return dao.queryDao(query,content);
	}

	@Override
	public List<MovieBDto> mlistDao() throws Exception {
		// TODO Auto-generated method stub
		return dao.mlistDao();
	}

	

}
