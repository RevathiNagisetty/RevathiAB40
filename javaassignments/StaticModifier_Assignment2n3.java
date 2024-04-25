package javaassignments;

public class StaticModifier_Assignment2n3 
{
	//Logic to do addition of 2 numbers
		public static void add()
		{
			int a = 20,b = 5, sum;
			sum = a+b;
			System.out.println("The addition of 2 numbers: " + sum);
		}
		
		//Logic to do Subtraction of 2 numbers
		public static void sub()
		{
			int a = 20,b = 5, sub;
			sub = a-b;
			System.out.println("The subtraction of 2 numbers: " + sub);
		}
		
		//Logic to do multiplication of 2 numbers
		public static void mul()
		{
			int a = 20,b = 5, mul;
			mul = a*b;
			System.out.println("The multiplication of 2 numbers: " + mul);
		}
		
		//Logic to do multiplication of 2 numbers
		public static void div()
		{
			int a = 20,b = 5, div;
			div = a/b;
			System.out.println("The division of 2 numbers: " + div);
		}
		
		public static void main(String[] args) 
		{
			add();
			sub();
			mul();
			div();		
		}
}
