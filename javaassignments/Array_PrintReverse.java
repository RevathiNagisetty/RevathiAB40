package javaassignments;

import java.util.Arrays;
import java.util.Scanner;

public class Array_PrintReverse 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the array : ");		
		int length_of_array = sc.nextInt();
		int[] int_array = new int[length_of_array];
		int[] int_array2 = new int[length_of_array];
		for(int i = 0; i< int_array.length; i++)
		{
			System.out.print("Enter the " + i + " element of the array : ");
			int_array[i] = sc.nextInt();			
		}
		int j = int_array2.length-1;
		System.out.println(j);
		for(int i = 0; i<int_array2.length ; i++)
		{
			int_array2[j] = int_array[i];
			j--;
		}
		System.out.println(Arrays.toString(int_array));
		System.out.println(Arrays.toString(int_array2));
		sc.close();
	}
}
