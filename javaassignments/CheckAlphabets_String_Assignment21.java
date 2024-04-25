package javaassignments;

import java.util.Scanner;

public class CheckAlphabets_String_Assignment21 
{
	public static void main(String[] args)
	{
		//check if the string only consists of alphabets		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.next();
		char[] ch = str.toCharArray();
		int countOfAlphabets = 0;
		for(int i =0; i<str.length(); i++)
		{
			if(Character.isAlphabetic(ch[i]) == true)
			{
				countOfAlphabets++;
			}
		}
		if(countOfAlphabets == str.length())
		{
			System.out.println("The string only consists of alphabets");
		}	
		else
		{
			System.out.println("The string is not purely contains alphabets");
		}
		
		
		
		//check if the string contains only numbers
		System.out.print("Enter the String : ");
		String str1 = sc.next();
		char[] ch1 = str1.toCharArray();
		int countOfnumbers = 0;
		for(int i =0; i<str1.length(); i++)
		{
			if(Character.isDigit(ch1[i]) == true)
			{
				countOfnumbers++;
			}
		}
		if(countOfnumbers == str.length())
		{
			System.out.println("The string only consists of numbers");
		}	
		else
		{
			System.out.println("The string is not purely contains digits");
		}		
		sc.close();		
	}
}
