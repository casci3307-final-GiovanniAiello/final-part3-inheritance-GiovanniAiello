package com.mycompany.part3.section3;

public class MainEntry {
	public static void main(String[] args) {
		
		Person p1,p2;
		Student s = new StudentImpl("ilker", "java");
		
		Teacher t = new TeacherImpl("Giovanni","java");
		
		p1 = t;
		p2 = s;
		System.out.println("p1 name:" + p1.getName());
		System.out.println("p2 courseTitle:" + p2.getName());
	}
		
}
