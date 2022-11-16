package com.springlec.base;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Form_02 {
	
	@RequestMapping("/student/{studentId}")
	public String getStudent( HttpServletRequest request, Model model) {
		String studentId = request.getParameter("studentId");
		
		model.addAttribute("studentId",studentId);
		
		return"student/studentView"	;
	}
	@RequestMapping("/")
	public String getStudent() {
		return"student/studentInsert"	;
	}

}
