package com.springlec.base.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springlec.base.dao.BDao;
import com.springlec.base.model.BDto;


@Service
public class BDaoServiceImpl02 implements BDaoService02 {
	
	
	
	@Autowired
	BDao dao;
	@Override
	public void writeDao(HttpServletRequest request) throws Exception {
		// TODO Auto-generated method stub
		String bName = request.getParameter("bName");
		String bTitle = request.getParameter("bTitle");
		String bContent = request.getParameter("bContent");
		
		dao.writeDao(bName, bTitle, bContent);
		
	}

	@Override
	public BDto viewDao(int bId) throws Exception {
		return dao.viewDao(bId);
	}

	@Override
	public void deleteDao(int bId) throws Exception {
		dao.deleteDao(bId);
		
	}

	@Override
	public void updateDao(String bName, String bTitle, String bContent, int bId) throws Exception {
		dao.updateDao(bName, bTitle, bContent, bId);
		
		// TODO Auto-generated method stub
		
	}


}
