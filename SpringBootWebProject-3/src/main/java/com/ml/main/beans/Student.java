package com.ml.main.beans;

public class Student 
{
	private String name;
	private int rollNo;
	private float marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	
	public Student(String name, int rollNo, float marks) {
		
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}
	
	public void displayStudentdetails()
	{
		System.out.println("Name: " + name);
		System.out.println("Rollno: "+ rollNo);
		System.out.println("Marks: " + marks);
	}
	
	
	
}
