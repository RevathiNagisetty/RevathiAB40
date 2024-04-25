package javaassignments;

import java.util.Scanner;

public class Scanner_Assignment8 
{
	Scanner sc = new Scanner(System.in);
	int First_Number, Second_Number;
	
	public void Assign() 
	{
		System.out.print("Enter the first number : ");
		First_Number = sc.nextInt();
		System.out.print("Enter the Second number : ");
		Second_Number = sc.nextInt();
	}
	
	public void add()
	{		
		System.out.println("Addition::");
		Assign();
		int sum = First_Number + Second_Number;
		System.out.println("The addition of 2 numbers: " + sum);		
	}
	
	public void sub()
	{		
		System.out.println("Subtraction::");
		Assign();
		int subtraction = First_Number - Second_Number;
		System.out.println("The subtraction of 2 numbers: " + subtraction);
	}	
	
	public void mul()
	{		
		System.out.println("Multiplication::");
		Assign();
		int Multiplication = First_Number * Second_Number;
		System.out.println("The Multiplication of 2 numbers: " + Multiplication);
	}		
	
	public void div()
	{		
		System.out.println("Division::");
		Assign();
		int Division = First_Number / Second_Number;
		System.out.println("The Division of 2 numbers: " + Division);		
	}
	
	
	public void mod()
	{		
		System.out.println("Modulus ::");
		Assign();
		int Modulus = First_Number % Second_Number;
		System.out.println("The Multiplication of 2 numbers: " + Modulus);			
	}
	
	public static void main(String[] args) 
	{	
		Scanner_Assignment8 sc_obj = new Scanner_Assignment8();
		sc_obj.add();		
		sc_obj.sub();
		sc_obj.mul();
		sc_obj.div();
		sc_obj.mod();	
		sc_obj.sc.close();
	}
}
