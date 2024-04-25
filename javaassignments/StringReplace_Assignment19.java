package javaassignments;

import java.util.Scanner;

public class StringReplace_Assignment19 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name : ");
		String name = sc.next();
		String new_String = name.replaceAll("[A-Z]", "manish");
		System.out.println(new_String);
		sc.close();
	}
}
