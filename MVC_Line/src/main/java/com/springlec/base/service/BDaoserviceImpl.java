package com.springlec.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springlec.base.dao.BDaoDao;
import com.springlec.base.model.BDto;

@Service
public class BDaoserviceImpl implements BDaoService {
	
	@Autowired
	BDaoDao dao;

	@Override
	public List<BDto> listDao() throws Exception {
		
		return dao.listDao();
	}

}
