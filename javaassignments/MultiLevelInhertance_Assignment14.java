package javaassignments;
class Class1
{
	Class1()
	{
		System.out.println("I am constructor in Class1");
	}
	public void add()
	{
		System.out.println("Method in Class1");
	}
	
}
class Class2 extends Class1
{
	Class2()
	{
		System.out.println("I am constructor in Class2");
	}
	public void sub()
	{
		System.out.println("Method in Class2");
	}
}

class Class3 extends Class2
{
	Class3()
	{
		System.out.println("I am constructor in Class3");
	}
	public void mul()
	{
		System.out.println("Method in Class3");
	}
}

class Class4 extends Class3
{
	Class4()
	{
		System.out.println("I am constructor in Class4");
	}
	public void div()
	{
		System.out.println("Method in Class4");
	}
}


public class MultiLevelInhertance_Assignment14 extends Class4
{
	MultiLevelInhertance_Assignment14()
	{
		System.out.println("I am constructor in Class5");
	}
	public void mod()
	{
		System.out.println("Method in Class5");
	}
	public static void main(String[] args) 
	{
		MultiLevelInhertance_Assignment14 m_obj = new MultiLevelInhertance_Assignment14();
		m_obj.add();
		m_obj.sub();
		m_obj.mul();
		m_obj.div();
		m_obj.mod();		
	}
}
