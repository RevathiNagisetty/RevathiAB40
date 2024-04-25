package collectionsassignments;

import java.util.ArrayList;
import java.util.List;

public class Upcast_ArrayList_List_Assignment2 
{

	public static void main(String[] args) 
	{
		List array_list = new ArrayList();
		array_list.add("Revathi");
		array_list.add(12);
		array_list.add('c');
		array_list.add(345);
		array_list.add(true);
		System.out.println(array_list);	
		
		List array_list1 = new ArrayList();		
		array_list1.addAll(array_list);
		System.out.println(array_list1);
		array_list1.addAll(2, array_list);
		System.out.println(array_list1);
		System.out.println(array_list1.contains("Revathi"));
		System.out.println(array_list1.containsAll(array_list));
		array_list1.remove(0);
		System.out.println(array_list1);			
		array_list1.clear();
		System.out.println(array_list1);
	}
}
