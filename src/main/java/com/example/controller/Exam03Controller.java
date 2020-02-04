package com.example.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex03")
public class Exam03Controller {

	@Autowired
	private ServletContext application;
	
	@RequestMapping("")
	public String index() {
		return "exam03";
	}
	
	@RequestMapping("/result")
	public String result(int num1,int num2, int num3) {
		int sum = num1 + num2 + num3;
		int incluedTax =(int)(sum * 1.08);
		
		application.setAttribute("price", sum);
		application.setAttribute("priceIncluededTax", incluedTax);
		
		return "exam03-result";
	}
}
