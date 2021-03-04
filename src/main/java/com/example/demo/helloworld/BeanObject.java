package com.example.demo.helloworld;

public class BeanObject {

	private String name;

	
	
	public BeanObject(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "BeanObject [name=" + name + "]";
	}
	
	
	
}
