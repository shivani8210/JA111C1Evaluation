package com.shi;

public class JavaBean5 {

	public static void main(String[] args) {
		Circle obj = new Circle();
		obj.Area(3);
		obj.Area(5.5);
		
		Rectangle obj1 = new Rectangle();
		obj1.Area(30, 20);
		obj1.Area(12.5, 4.5);
		
		Square obj2 = new Square();
		obj2.Area(20);
		obj2.Area(5.2);

	}

}

class Circle {
	static final double PI = Math.PI;
	void Area(double r) {
		double A = PI*r*r;
		System.out.println("Area of the circle is :" + A);
	}
	
	void Area(float r) {
		double A = PI*r*r;
		System.out.println("Area of the circle is :" + A);
	}
}

class Rectangle {
	void Area(double l, double b) {
		System.out.println("Area of the rectangle: " + l * b);
	}
	
	void Area(int l, int b) {
		System.out.println("Area of the rectangle: " + l * b);
	}
}

class Square {
	void Area(double side) {
		System.out.println("Area of the Square: " + side * side);
	}
	
	void Area(float side) {
		System.out.println("Area of the Square: " + side * side);
	}
}
