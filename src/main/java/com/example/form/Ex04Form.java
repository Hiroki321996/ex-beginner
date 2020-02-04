package com.example.form;

public class Ex04Form {

	private String name;
	private String age;
	private String comment;

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Ex04Form [name=" + name + ", age=" + age + ", comment=" + comment + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}
