package com.codegnan.fundamentals;

import java.util.Scanner;

public class SimpleAndCompoundInterest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Principle amount:");
		double p = scanner.nextDouble();
		System.out.println("Enter the rate of Interest:");
		double r = scanner.nextDouble();
		System.out.println("Enter the time in Months:");
		int t = scanner.nextInt();
		double timeinYears = (double)t/12;
		double simpleInterest = (p*r*timeinYears)/100;
		double totalAmount = simpleInterest+p;
		System.out.println("simple interest is:" +simpleInterest+"and total amount is:" +totalAmount);
		double amount = p*(Math.pow((1+r/100), timeinYears));
		double compoundInterest = amount-p;
		double ctotalAmount = compoundInterest+p;
		System.out.println("Compound Interest is:" +compoundInterest+ "and Total amount is:" +ctotalAmount);
		scanner.close();
	}

}
