package com.springlec.base.dao;

import java.util.List;

import com.springlec.base.model.BDto;
import com.springlec.base.model.MovieBDto;

public interface BDao {
	
	public List<BDto> listDao() throws Exception;
	
	public List<BDto> queryDao(String query, String content) throws Exception;
	
	public List<MovieBDto> mlistDao() throws Exception;
	
	
}
