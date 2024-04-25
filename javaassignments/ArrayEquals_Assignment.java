package javaassignments;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEquals_Assignment 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the array : ");		
		int length_of_array = sc.nextInt();
		int[] int_array = new int[length_of_array];
		for(int i = 0; i< int_array.length; i++)
		{
			System.out.print("Enter the " + i + " element of the array : ");
			int_array[i] = sc.nextInt();			
		}
		
		
		System.out.print("\nEnter the length of the second array : ");		
		int length_of_array2 = sc.nextInt();
		int[] int_array2 = new int[length_of_array2];
		for(int i = 0; i< int_array2.length; i++)
		{
			System.out.print("Enter the " + i + " element of the second array : ");
			int_array2[i] = sc.nextInt();			
		}
		boolean result = Arrays.equals(int_array, int_array2);
		if(result == true)
		{
			System.out.println("Both arrays are equals");
		}
		else
			System.out.println("Both arrays are not equal");
		sc.close();
	}
	

}
