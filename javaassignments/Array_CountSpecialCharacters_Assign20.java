package javaassignments;

import java.util.Arrays;
import java.util.Scanner;

public class Array_CountSpecialCharacters_Assign20
{	
	public static void main(String[] args) 
	{
		//finding the number of special characters in a given string
		String name = "Manish123 $# Kumar";
		int no_of_specialchar = 0;
		char[] ch_array = name.toCharArray();
		for(int i =0; i<name.length(); i++)
		{
			if((Character.isAlphabetic(ch_array[i]) == false) && (Character.isDigit(ch_array[i]) == false) 
				&& (Character.isSpaceChar(ch_array[i]) == false))
			{
				no_of_specialchar++;					
			}
		}
		System.out.println("The number of special characters present : " + no_of_specialchar);
		
		//Inserting elements of the array using scanner class
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the string :");
		int length_of_array = sc.nextInt();
		int[] int_array = new int[length_of_array];
		for(int i = 0; i<int_array.length; i++)
		{
			System.out.print("Enter the " + "i" + " element of the array : ");
			int_array[i] = sc.nextInt();
		}
				
		System.out.println(Arrays.toString(int_array));
		sc.close();
	}
}
