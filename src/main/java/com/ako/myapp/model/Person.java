package com.ako.myapp.model;

public class Person {
	String name,dateofBirth,nrc;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name, String dateofBirth, String nrc) {
		super();
		this.name = name;
		this.dateofBirth = dateofBirth;
		this.nrc = nrc;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateofBirth() {
		return dateofBirth;
	}

	public void setDateofBirth(String dateofBirth) {
		this.dateofBirth = dateofBirth;
	}

	public String getNrc() {
		return nrc;
	}

	public void setNrc(String nrc) {
		this.nrc = nrc;
	}

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}
}
