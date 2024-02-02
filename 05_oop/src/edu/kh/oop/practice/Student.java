package edu.kh.oop.practice;

public class Student {
	
	private static String schoolName = "KH대학교";
	
	private String name;
	private String number;
	private char gender;
	private int java;
	private int html;
	
	public Student(){}
	
	public Student(String name, String number, char gender, int java, int html) {
		this.name = name;
		this.number = number;
		this.gender = gender;
		this.java = java;
		this.html = html;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setStudentNumber(String number) {
		this.number = number;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void setJava(int java) {
		this.java = java;
	}
	
	public void setHtml(int html) {
		this.html = html;
	}
	
	//getter
	
	public String getName() {
		return name;
	}
	

	public String number() {
	return number;
	}

	public char getGender() {
	return gender;
	}

	public int getJava() {
	return java;
	}

	public int getHtml() {
	return html;
	}

}
