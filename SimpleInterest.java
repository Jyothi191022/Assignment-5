package com.codegnan.fundamentals;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principle amount:");
		double p=sc.nextDouble();
		System.out.println("Enter Rate of Intrest %:");
		double r=sc.nextDouble();
		System.out.println("Enter Time in years:");
		double t=sc.nextDouble();
		double simpleIntrest=(p*r*t)/100;
		double totalAmount=simpleIntrest+p;
		System.out.println("Simple Intrest is:"+simpleIntrest);
		System.out.println("Total Amount is:"+totalAmount);
		sc.close();
	}

}
