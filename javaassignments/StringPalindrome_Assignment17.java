package javaassignments;

import java.util.Scanner;

public class StringPalindrome_Assignment17 
{
	public static void main(String[] args) 
	{
		String output = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string :");
		String str = sc.next();
		for(int i = str.length()-1; i >=0; i--)
		{
			char rev = str.charAt(i);			
			output = output + rev;
		}
		System.out.println("The reversed string :" + output);
		
		if(str.equals(output))
		{
			System.out.println("The given string is a palindrome");
		}
		else
		{
			System.out.println("The given string is not palindrome");
		}
		sc.close();
	}
}
