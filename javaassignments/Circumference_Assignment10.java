package javaassignments;

import java.util.Scanner;

public class Circumference_Assignment10 
{
	final static double pi = 3.14;
	
	public static void CircumferenceOfCircle()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius : ");		
		int radius = sc.nextInt();
		double circumference = 2*pi*radius;
		System.out.println("The area of the circle is: " + circumference);	
		sc.close();
	}
	
	public static void main(String[] args) 
	{
		CircumferenceOfCircle();
	}
}
