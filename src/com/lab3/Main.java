package com.lab3;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		List<Student> al=new ArrayList<Student>();
		System.out.println("Student List (ordered by name)");
		Student s1=new Student(101,"Kim",23); //1
		al.add(s1);
		Student s2=new Student(102,"Choi",21); //2
		al.add(s2);
		al.add(new Student(103,"Park",25)); //3
		al.add(new Student(104,"A",17)); //4 
		al.add(new Student(105,"B",15)); //5
		al.add(new Student(106,"C",24)); //6
		al.add(new Student(107,"D",27)); //7
		al.add(new Student(108,"E",30)); //8
		al.add(new Student(109,"F",18)); //9
		al.add(new Student(110,"G",13)); //10
		
		Collections.sort(al);
		for(Student s : al) {
			System.out.println(s.toString());
		}
		System.out.println("Student Liist(reverse ordered by name)");
		
		Collections.sort(al, Collections.reverseOrder());
		
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i).toString());
		}
	}

}
