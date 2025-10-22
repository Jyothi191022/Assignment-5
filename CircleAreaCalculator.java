package com.codegnan.fundamentals;

import java.util.Scanner;

public class CircleAreaCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius of the circle:");
		double r = scanner.nextFloat();
		double area = 3.14*r*r;
		System.out.println("Area of Circle: " +area);
		scanner.close();
		

	}

}
