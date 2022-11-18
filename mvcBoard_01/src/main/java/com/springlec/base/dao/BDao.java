package com.springlec.base.dao;

import java.util.List;

import com.springlec.base.model.BDto;

public interface BDao {
	
	public List<BDto> listDao() throws Exception;
	// 글 작성 dao
	public void writeDao(String bName, String bTitle, String bContent) throws Exception;
	// 작성 글 보기
	public BDto viewDao(int bId) throws Exception;
	
	public void deleteDao(int bId) throws Exception;
	
	public void updateDao(String bName, String bTitle, String bContent, int bId) throws Exception;
}
