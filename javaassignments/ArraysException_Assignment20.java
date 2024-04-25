package javaassignments;

import java.util.Arrays;
//import java.util.Scanner;

public class ArraysException_Assignment20 
{
	public static void main(String[] args) 
	{		
		/*Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of elements in the array : ");
		int length_of_array = sc.nextInt();
		String[] str_array = new String[length_of_array];
		
		
		for(int i = 0; i< length_of_array; i++)
		{
			System.out.print("Enter the " + (i+1) + " element : ");
			str_array[i] = sc.next();
		}*/
		
		//ArrayIndexOutOfBoundsException
		String[] str_array = new String[4];
		str_array[0] = "Rev";
		str_array[1] = "ven";
		str_array[2] = "ani";
		str_array[3] = "dar";
		str_array[4] = "sur";		
		System.out.println("The elements of the array : " + Arrays.toString(str_array));
	}
}
