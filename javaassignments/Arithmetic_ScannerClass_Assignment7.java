package javaassignments;

import java.util.Scanner;

public class Arithmetic_ScannerClass_Assignment7 
{
	public static void add()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Addition::");
		System.out.print("Enter the first number : ");
		int First_Number = sc.nextInt();
		System.out.print("Enter the Second number : ");
		int Second_Number = sc.nextInt();
		int sum = First_Number + Second_Number;
		System.out.println("The addition of 2 numbers: " + sum + "\n");		
	}
	
	public static void sub()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Subtraction::");
		System.out.print("Enter the first number : ");
		int First_Number = sc.nextInt();
		System.out.print("Enter the second number : ");
		int Second_Number = sc.nextInt();
		int subtraction = First_Number - Second_Number;
		System.out.println("The subtraction of 2 numbers: " + subtraction +"\n");
	}	
	
	public static void mul()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Multiplication::");
		System.out.print("Enter the first number : ");
		int First_Number = sc.nextInt();
		System.out.print("Enter the Second number : ");
		int Second_Number = sc.nextInt();
		int Multiplication = First_Number * Second_Number;
		System.out.println("The Multiplication of 2 numbers: " + Multiplication + "\n");
	}		
	
	public static void div()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Division::");
		System.out.print("Enter the first number : ");
		int First_Number = sc.nextInt();
		System.out.print("Enter the second number : ");
		int Second_Number = sc.nextInt();
		int Division = First_Number / Second_Number;
		System.out.println("The Division of 2 numbers: " + Division + "\n");		
	}
	
	
	public static void mod()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Modulus ::");
		System.out.print("Enter the first number : ");
		int First_Number = sc.nextInt();
		System.out.print("Enter the second number : ");
		int Second_Number = sc.nextInt();
		int Modulus = First_Number % Second_Number;
		System.out.println("The Multiplication of 2 numbers: " + Modulus + "\n");	
		sc.close();
	}
	
	public static void main(String[] args) 
	{
		add();
		sub();
		mul();
		div();
		mod();		
	}
	
}
