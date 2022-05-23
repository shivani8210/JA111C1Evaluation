package com.shi;

public class JavaBean4 {
	private int rollNumber;
	private String studentName;
	private int marks;
	
	public JavaBean4() {
		
		
	}
	
	public JavaBean4(int rollNumber,String studentName,int marks) {
		this.rollNumber=rollNumber;
		this.studentName=studentName;
		this.marks=marks;
	}
	
	public void setrollNumber(int rollNumber) {
		this.rollNumber=rollNumber;
	}
	
	public int getrollNumber() {
		return rollNumber;
	}
	
	public void setstudentName(String studentName) {
		this.studentName=studentName;
	}
	
	public String getstudentName() {
		return studentName;
	}
	
	public void setMarks(int marks) {
		this.marks=marks;
	}
	
	public int getMarks() {
		return marks;
	}
	
	public void showDetails() {
		System.out.println("Student Roll Number :"+rollNumber);
		System.out.println("Student Name :"+studentName);
		System.out.println("Student Mark :"+marks);
	}

	public static void main(String[] args) {
		JavaBean4 j1 = new JavaBean4();
		j1.setrollNumber(567);
		j1.setstudentName("Sam");
		j1.setMarks(567);
		
		JavaBean4 j2 = new JavaBean4(669,"Ram",669);
		
		System.out.println("Student Detail 01");
		j1.showDetails();
		
		System.out.println("Student Detail 11");
		
		System.out.println("Student Roll Number :"+j2.getrollNumber());
		System.out.println("Student Name :"+j2.getstudentName());
		System.out.println("Student Mark :"+j2.getMarks());

	}

}
