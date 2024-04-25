package javaassignments;

public class StaticNonStatic_Assignemnt4 
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
	
	//Logic to find Modulus of 2 numbers
	public static void mod()
	{
		int a = 20, b = 5, mod;
		mod = a%b;
		System.out.println("The modulus of 2 numbers: " + mod);
	}
	
	public void addition()
	{
		int a = 30, b = 20,  c = 10, addition;
		addition = a+b+c;
		System.out.println("The addition of 3 numbers: " + addition);		
	}
	
	public void subtraction()
	{
		int a = 30,b = 20, c = 10, subtraction;
		subtraction = a-b-c;
		System.out.println("The subtraction of 2 numbers: " + subtraction);
	}
	
	public void multiplication()
	{
		int a = 30,b = 20, c = 10, multiplication;
		multiplication = a*b*c;
		System.out.println("The subtraction of 2 numbers: " + multiplication);
	}

	public void division()
	{
		int a = 30,b = 20, c = 10, division;
		division = (a/b)/c;
		System.out.println("The subtraction of 2 numbers: " + division);
	}
	public void modulus()
	{
		int a = 30,b = 20, c = 3, modulus;
		modulus = (a%b)%c;
		System.out.println("The subtraction of 2 numbers: " + modulus);
	}
	
	
	//calling static and non static method in main method	
	public static void main(String[] args) 
	{
		System.out.println("Static methods::");
		//calling static methods
		add();
		sub();
		mul();
		div();	
		mod();
		
		System.out.println("\nNon Static Methods::");
		//calling non static methods
		StaticNonStatic_Assignemnt4 sn_Obj = new StaticNonStatic_Assignemnt4();
		sn_Obj.addition();
		sn_Obj.subtraction();
		sn_Obj.multiplication();
		sn_Obj.division();
		sn_Obj.modulus();
	}
}
