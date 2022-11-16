package com.springlec.base.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springlec.service.CalcService;

@Controller
public class AController {
	
	@Autowired
	CalcService service;
	// new를 안쓰고 CalcService를 service로 받아왔음.
	
	
	//계산 입력 화면
	@RequestMapping("/")
	public String input() {
		return "input";
	}
	
	//계산 실행
	@RequestMapping("/addCalc")
	public String calc(HttpServletRequest request, Model model)  throws Exception{
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		int addResult = service.addAction(num1, num2);
		int mulAction = service.mulAction(num1, num2);
		if(addResult == 20) {
			return "redirect:Pika";
		}
		model.addAttribute("num1", num1);
		model.addAttribute("num2", num2);
		model.addAttribute("addtion", addResult);
		model.addAttribute("mulAction", mulAction);
		
		return "calcResult";
		
		
		
	}
	@RequestMapping("/mulCalc")
	public String Mul(HttpServletRequest request, Model model)  throws Exception{
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		int mulAction = service.mulAction(num1, num2);
		
		model.addAttribute("num1", num1);
		model.addAttribute("num2", num2);
		model.addAttribute("mulAction", mulAction);
		
		return "calcResult";

	}
	@RequestMapping("/Pika")
	public String Pika() {
		return "PikaChu";
	}
}
