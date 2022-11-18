package com.springlec.base.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springlec.base.model.BDto;
import com.springlec.base.model.MovieBDto;
import com.springlec.base.service.BDaoService;

@Controller
public class BController {
	String re = "redirect:";
	
	@Autowired
	BDaoService service;
	
	//게시판 검색
	@RequestMapping("/list")
	public String list(Model model) throws Exception{
		List<BDto> listDao = service.listDao();
		model.addAttribute("list",listDao);
		return "list";
	}
	
	//게시판 검색
		@RequestMapping("/listquery")
		public String query(HttpServletRequest request, Model model) throws Exception{
			String query = request.getParameter("query");
			String content = request.getParameter("content");
			List<BDto> queryDao = service.queryDao(query,content);
			model.addAttribute("list",queryDao);
			model.addAttribute("size",queryDao.size());
			return "list";
		}
	
	// 게시판 입력 화면
	@RequestMapping("/write_view")
	public String wireteview() {
		return "write_view";
	}
	
	@RequestMapping("/mlist")
	public String mlistDao(Model model) throws Exception{
		List<MovieBDto> mlistDao = service.mlistDao();
		model.addAttribute("movielist",mlistDao);
		model.addAttribute("size",mlistDao.size());
		return "movielist";
	}
	
	
	
	
	
}
