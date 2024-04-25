package javaassignments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Arrays_Assignment23
{

	public static void main(String[] args) 
	{
		try
		{
		int[] array_int = new int[4];
		array_int[0] = 23;
		array_int[1] = 32;
		array_int[2] = 43;
		array_int[3] = 65;
		array_int[4] = 34;			
		}
		
		catch(ArrayIndexOutOfBoundsException ex1)
		{
			System.out.println("Array Index out of Bounds Exception");
		}
		finally
		{
			System.out.println("finally block");
		}
	}

}
