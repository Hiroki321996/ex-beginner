package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex02")
public class Ex02Controller {

	@Autowired
	private HttpSession session;
	
	@RequestMapping("")
	public String index() {
		return "exam02";
	}
	
	@RequestMapping("/calc")
	public String calc(String num1,String num2) {
		int numInt1 = Integer.parseInt(num1);
		int numInt2 = Integer.parseInt(num2);
		int sum;
		
		sum = numInt1 + numInt2;
		session.setAttribute("num1", numInt1);
		session.setAttribute("num2", numInt2);
		session.setAttribute("sum", sum);
		
		return "exam02-result";
	}
	
	@RequestMapping("/result2")
	public String result2() {
		return "exam02-result2";
	}
	
	
}
