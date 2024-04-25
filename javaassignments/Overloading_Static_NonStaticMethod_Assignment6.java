package javaassignments;

public class Overloading_Static_NonStaticMethod_Assignment6 
{
	//overloading constructor
	Overloading_Static_NonStaticMethod_Assignment6()
	{
		System.out.println("i am constructor");
	}
	Overloading_Static_NonStaticMethod_Assignment6(int a)
	{
		System.out.println("I am overloaded constructor");
	}
	
	
	//Overloading static method
	static void add(int a, int b)
	{
		int sum;
		sum = a+b;
		System.out.println("The sum of 2 numbers: "+ sum);		
	}
	
	static void add(int a, int b, int c)
	{
		int sum;
		sum = a+b+c;
		System.out.println("The sum of 3 numbers: " + sum);
	}
	
	//overloading non static method
	
	void print(String a, String b)
	{
		System.out.println(a+b);
	}
	
	void print(String a, String b, boolean c)
	{
		if(c == true)
		{
		System.out.println(a+b);
		}
	}
	
	
	public static void main(String[] args) 
	{
		//calling static methods
		add(10,20);
		add(10,30,50);		
		
		//calling constructor
		new Overloading_Static_NonStaticMethod_Assignment6(10);
		
		//calling non static methods
		Overloading_Static_NonStaticMethod_Assignment6 sn_obj = new Overloading_Static_NonStaticMethod_Assignment6();
		sn_obj.print("Revathi", "Devi");
		sn_obj.print("Revathi", "Devi", true);		
	}
}
