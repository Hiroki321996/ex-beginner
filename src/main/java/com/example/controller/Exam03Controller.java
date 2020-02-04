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
	public String result(String item1,String item2, String item3) {
		int numInt1 = Integer.parseInt(item1);
		int numInt2 = Integer.parseInt(item2);
		int numInt3 = Integer.parseInt(item3);
		
		int sum = numInt1+ numInt2 + numInt3;
		int incluedTax =(int)(sum * 1.08);
		
		application.setAttribute("price", sum);
		application.setAttribute("priceIncludedTax", incluedTax);
		
		return "exam03-result";
	}
}
