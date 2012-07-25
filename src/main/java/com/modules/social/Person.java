package com.modules.social;

import java.util.Date;

public class Person {
	private String name;
	private Date bornDate;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, Date bornDate) {
		this.name = name;
		this.bornDate = bornDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBornDate() {
		return bornDate;
	}

	public void setBornDate(Date bornDate) {
		this.bornDate = bornDate;
	}
}
