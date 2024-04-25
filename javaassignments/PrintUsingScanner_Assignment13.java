package javaassignments;

import java.util.Scanner;

public class PrintUsingScanner_Assignment13 
{
	public static void main(String[] args) 
	{
		double area, pi = 3.14;
		int radius;
		Scanner sc = new Scanner(System.in);
		for(int i =1; i<=10; i++) 
		{
			System.out.println("Enter the radius : ");
			radius = sc.nextInt();
			area = pi*(radius*radius);
			System.out.println("The area of a circle : " + area);			
		}
		sc.close();
	}

}
