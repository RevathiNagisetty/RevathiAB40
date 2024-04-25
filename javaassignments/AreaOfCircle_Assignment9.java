package javaassignments;

import java.util.Scanner;

public class AreaOfCircle_Assignment9 
{
	final static double pi = 3.14;
	
	public static void AreaOfCircle()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius : ");		
		int radius = sc.nextInt();
		double area = pi*(radius*radius);
		System.out.println("The area of the circle is: " + area);
		
		System.out.print("Enter the radius in double : ");		
		double radius_double = sc.nextDouble();
		double area1 = pi*(radius_double*radius_double);
		System.out.println("The area of the circle is: " + area1);		
		sc.close();
	}
	public static void main(String[] args) 
	{
		AreaOfCircle();
	}
}
