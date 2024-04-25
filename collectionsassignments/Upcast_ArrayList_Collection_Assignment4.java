package collectionsassignments;

import java.util.ArrayList;
import java.util.Collection;

public class Upcast_ArrayList_Collection_Assignment4 
{
	public static void main(String[] args) 
	{
		Collection array_list = new ArrayList();
		array_list.add("Revathi");
		array_list.add("Devi");
		array_list.add(124);
		array_list.add('b');
		array_list.add(456);
		array_list.add(null);
		array_list.add(false);
		array_list.add(3);
		System.out.println(array_list);
		
		Collection array_list1 = new ArrayList();
		array_list1.addAll(array_list);
		System.out.println(array_list1);
		System.out.println(array_list1.contains("Devi"));
		System.out.println(array_list1.isEmpty());
		System.out.println(array_list1.size());
		array_list1.clear();
		System.out.println(array_list1);
	}
}
