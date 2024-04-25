package javaassignments;

import java.util.Scanner;

public class SwitchCase_Assignment15
{
	static int First_Number, Second_Number;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the operation to perform (+,-,*,/,%) : ");
		String OperationToPerform = sc.next();
		switch(OperationToPerform)
		{
		case "+":
		
			System.out.print("Enter the First Number : ");
			First_Number = sc.nextInt();
			System.out.print("Enter the Second Number : ");
			Second_Number = sc.nextInt();
			int sum = First_Number + Second_Number;
			System.out.println("The addition of 2 numbers is : " + sum);
			break;
		
		case "-":
			
			System.out.print("Enter the First Number : ");
			First_Number = sc.nextInt();
			System.out.print("Enter the Second Number : ");
			Second_Number = sc.nextInt();
			int Difference = First_Number - Second_Number;
			System.out.println("The subtraction of 2 numbers is : " + Difference);
			break;
			
		case "*":
			
			System.out.print("Enter the First Number : ");
			First_Number = sc.nextInt();
			System.out.print("Enter the Second Number : ");
			Second_Number = sc.nextInt();
			int Multiplication = First_Number * Second_Number;
			System.out.println("The Multiplication of 2 numbers is : " + Multiplication);
			break;
			
		case "/":
			System.out.print("Enter the First Number : ");
			First_Number = sc.nextInt();
			System.out.print("Enter the Second Number : ");
			Second_Number = sc.nextInt();
			int Division = First_Number / Second_Number;
			System.out.println("The Division of 2 numbers is : " + Division);
			break;
			
		case "%":
			
			System.out.print("Enter the First Number : ");
			First_Number = sc.nextInt();
			System.out.print("Enter the Second Number : ");
			Second_Number = sc.nextInt();
			int Modulus = First_Number % Second_Number;
			System.out.println("The Modulus of 2 numbers is : " + Modulus);
			break;
			
		default: System.out.println("Enter the valid input : ");		
		}
		sc.close();
	}

}
  