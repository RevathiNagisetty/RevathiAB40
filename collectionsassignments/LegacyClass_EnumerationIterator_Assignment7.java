package collectionsassignments;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class LegacyClass_EnumerationIterator_Assignment7 
{
	public static void main(String[] args) 
	{
		Vector v= new Vector();
		v.addElement(345);
		v.addElement(356);
		v.addElement(34);
		v.addElement(45);
		v.addElement(678);
		v.addElement(899);
		v.addElement(564);			
		Enumeration e = v.elements();
		while(e.hasMoreElements() == true)
		{
			System.out.println(e.nextElement());
		}
		
		Hashtable ht = new Hashtable();
		ht.put(1, 234);
		ht.put(2, 456);
		ht.put(3, 789);
		System.out.println("\n*** HashTable ***");
		Enumeration e1= ht.elements();
		while(e1.hasMoreElements() == true)
		{
			System.out.println(e1.nextElement());
		}		
	}
}
