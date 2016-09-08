package com.sm;

class Student {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

public class Abc {

	public static void main(String[] args) {
		Student stud = new Student();
		stud.setName("Sashi");
		System.out.println(stud.getName());

	}

}
