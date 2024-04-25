package javaassignments;

abstract class Abstract_Class1
{
	abstract void abstract_Method1();
	abstract void abstract_Method2();
	public void add()
	{
		System.out.println("Concrete method in grand parent class");
	}	
}

abstract class Abstract_Class2 extends Abstract_Class1
{
	abstract void abstract_Method3();
	abstract void abstract_Method4();
	public static void sub()
	{
		System.out.println("Concrete method in parent class");		
	}
}
public class AbstractClass_Method_Assignment16 extends Abstract_Class2
{
	void mul()
	{
		System.out.println("Concrete method 1 in sub class");
	}
	
	void div()
	{
		System.out.println("concrete method 2 in sub class");
	}

	public static void main(String[] args) 
	{
		AbstractClass_Method_Assignment16 obj = new AbstractClass_Method_Assignment16();
		obj.add();
		sub();
		obj.mul();
		obj.div();
		obj.abstract_Method1();
		obj.abstract_Method2();
		obj.abstract_Method3();
		obj.abstract_Method4();
	}

	@Override
	void abstract_Method3() 
	{
		System.out.println("Overrided method 1 from parent class");		
	}

	@Override
	void abstract_Method4() 
	{
		System.out.println("Overrided method 2 from parent class");		
	}

	@Override
	void abstract_Method1() 
	{		
		System.out.println("Overrided method 1 from grand parent class");
	}

	@Override
	void abstract_Method2()
	{
		System.out.println("Overrided method 2 from grand parent class");		
	}
}
