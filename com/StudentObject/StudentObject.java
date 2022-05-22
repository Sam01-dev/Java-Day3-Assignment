package com.StudentObject;

public class StudentObject {
	
	int roll;
	String name;
	int marks;
	
	void displayStudentDetails() {
		
		System.out.println("Roll is:"+roll);
		System.out.println("Name is:"+name);
		System.out.println("Marks is:"+marks);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentObject s1 = new StudentObject();
		s1.roll = 5;
		s1.name = "Sam";
		s1.marks = 200;
		s1.displayStudentDetails();
		
		StudentObject s2 = new StudentObject();
		s2.roll = 6;
		s2.name = "Sammy";
		s2.marks = 250;
		s2.displayStudentDetails();
		
		s1 = null;
		s2 = null;
		
		

	}

}
