package com.lab3;

public class Student implements Comparable<Student>{
	private int no;
	private String name;
	private int age;
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name.toString();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Student(int age, String name, int no) {
		// TODO Auto-generated constructor stub
		this.age = age;
		this.name = name.toString();
		this.no = no;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}
	
	public String toString() {
		return "Student [no=" + this.no + ", name=" + this.name + ", age=" + this.age + "]";
	}
	
}
