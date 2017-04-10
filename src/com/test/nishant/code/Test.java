package com.test.nishant.code;

public class Test {

	private String name = "sumanth";

	public static void main(String[] args) {
	
		Test test = new Test();
		System.out.println(test.name);
		System.out.println(test.getName());
	}
	
	public String getName(){
		return name;
	}

}
