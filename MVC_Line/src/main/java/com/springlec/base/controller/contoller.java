package com.springlec.base.controller; 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springlec.base.model.BDto;
import com.springlec.base.service.BDaoService;

@Controller
public class contoller {
	
	@Autowired
	BDaoService Service;
	
	@RequestMapping("/list")
	public String list(Model model) throws Exception{
		List<BDto> listDao = Service.listDao();
		model.addAttribute("list",listDao);
		return "list";
	}

}
