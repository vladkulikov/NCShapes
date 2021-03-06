package com.company;

public class Main {

    public static void main(String[] args) {
	    Square square = new Square(0.0);
	    Ellipse ellipse = new Ellipse(1.0, 2.0);
	    Triangle triangle = new Triangle(2.0, 3.0);
	    Circle circle = new Circle(2.1);
	    square.setRadius(12);
	    ellipse.setA(12);
	    ellipse.setB(4);
	    triangle.setBase(10);
	    triangle.setHeight(5);
	    circle.setRadius(-21);

	    System.out.printf("Area %s = %s \n", square.getName(), square.getArea());
        System.out.printf("Area %s = %s \n", ellipse.getName(), ellipse.getArea());
        System.out.printf("Area %s = %s \n", triangle.getName(), triangle.getArea());
        System.out.printf("Area %s = %s \n", circle.getName(), circle.getArea());



    }
}
