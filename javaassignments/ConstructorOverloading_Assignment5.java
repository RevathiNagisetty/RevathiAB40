package javaassignments;

public class ConstructorOverloading_Assignment5 
{
	ConstructorOverloading_Assignment5(int a)
	{
		System.out.println(a);
	}
	
	ConstructorOverloading_Assignment5(char c)
	{
		System.out.println(c);
	}
	ConstructorOverloading_Assignment5(String s)
	{
		System.out.println(s);
	}
	ConstructorOverloading_Assignment5(Boolean b)
	{
		System.out.println(b);
	}
	ConstructorOverloading_Assignment5(int a, boolean b, String s)
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(s);
	}
	public static void main(String[] args) 
	{
		 new ConstructorOverloading_Assignment5(10);
		 new ConstructorOverloading_Assignment5('a');
		 new ConstructorOverloading_Assignment5("hello");
		 new ConstructorOverloading_Assignment5(true);
		 new ConstructorOverloading_Assignment5(10,true,"hello");

	}

}
