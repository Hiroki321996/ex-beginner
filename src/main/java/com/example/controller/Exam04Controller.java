package com.example.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.User;
import com.example.form.Ex04Form;

@Controller
@RequestMapping("/ex04")
public class Exam04Controller {
	
	@Autowired
	private ServletContext application;
	
	
	
	@ModelAttribute
	public Ex04Form setUpForm() {
		return new Ex04Form();
	}
	
	@RequestMapping("")
	public String index() {
		return "exam04";
	}
	
	@RequestMapping("/self-introduction")
	public String selfIntroduction(@Validated Ex04Form form,
			BindingResult result,String name,String age,String comment
			) {
		
		if(result.hasErrors()) {
			return index();
		}
//		application.setAttribute("name", name);
//		application.setAttribute("age", age);
//		application.setAttribute("comment", comment);
		
		User user = new User();
		user.setName(form.getName());
		user.setAge(form.getIntAge());
		user.setComment(form.getComment());
		
		application.setAttribute("user", user);
		return "exam04-result";
	}
}
