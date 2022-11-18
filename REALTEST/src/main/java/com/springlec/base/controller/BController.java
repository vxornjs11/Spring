package com.springlec.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BController {
	
	@RequestMapping("/list")
	public String listDao() {
		return "list";
	}

}
