package com.springlec.base;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class image {
	
	@RequestMapping("/FIRE")
	public String hello() {
		return "image";
	}

}
