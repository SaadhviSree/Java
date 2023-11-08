package main;

abstract class Shape{
	abstract void draw();
	abstract double calcArea(double radius, double height);
}

class circle extends Shape{
	double radius;
	void draw() {
		System.out.println("Circle");
	}
	double calcArea(double radius,double height) {
		double area = 3.14*radius*radius;
		return area;
	}
}

class cylinder extends Shape{
	double radius;
	double height;
	double calcArea(double radius, double height) {
		double area = 2*3.14*radius*(radius+height);
		return area;
	}
	void draw() {
		System.out.println("Cylinder");
	}
}

public class MAIN {
	public static void main(String[] args) {
		circle CI = new circle();
		CI.draw();
		System.out.println(CI.calcArea(10, 0));
		cylinder CY = new cylinder();
		CY.draw();
		System.out.println(CY.calcArea(10,10));
	}

}
