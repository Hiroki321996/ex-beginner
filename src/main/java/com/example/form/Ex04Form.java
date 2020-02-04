package com.example.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Ex04Form {
	@NotBlank(message="名前は必須です")
	private String name;
	@NotBlank(message="年齢は必須です")
	private String age;
	@NotBlank(message="コメントは必須です")
	@Size(min=1, max=150, message="コメントは150以内で入力してください")
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
