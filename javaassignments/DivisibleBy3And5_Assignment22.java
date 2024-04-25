package javaassignments;

import java.util.Scanner;

public class DivisibleBy3And5_Assignment22 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number = sc.nextInt();
		if(number % 3 == 0 && number % 5 == 0)
		{
			System.out.println("Frog and Cat");
		}
		else if(number % 3 ==0)
		{
			System.out.println("Frog");			
		}
		else if(number % 5 ==0)
		{
			System.out.println("Cat");
		}		
		sc.close();
		

	}

}
