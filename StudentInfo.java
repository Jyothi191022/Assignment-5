package com.codegnan.fundamentals;

import java.util.Scanner;

public class StudentInfo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Name:");
		String name=sc.next();
		System.out.println("Enter Student Roll Number:");
		int rollNumber=sc.nextInt();
		System.out.println("Enter Student Age:");
		int age=sc.nextInt();
		System.out.println("Enter Student Grade:");
		String grade=sc.next();
		System.out.println("Student Details:");
		System.out.println("Student Name:"+name);
		System.out.println("Student Roll Number:"+rollNumber);
		System.out.println("Student Age:"+age);
		System.out.println("Student Grade:"+grade);
		sc.close();

	}

}
