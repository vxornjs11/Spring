package com.springlec.base;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class redi {
	
	@RequestMapping("/student")
	public String studentRedirect(HttpServletRequest request, Model model)throws Exception {
		String id = request.getParameter("id");
		if(id.equals("abc")) {
			return "redirect:studentOK";
			//redirect가 붙으면 Mapping이다.
		}
		return "redirect:studentNG";
	}
	@RequestMapping("/studentOK")
	public String studentOK() throws Exception{
		return "student/studentOK";
	}
	@RequestMapping("/studentNG")
	public String studentNG() throws Exception {
		return "student/studentNG";
	}

}
