package collectionsassignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterator_ArrayList_Assignment5 
{
	public static void main(String[] args) 
	{
		List array_list = new ArrayList();
		array_list.add("Revathi");
		array_list.add("Devi");
		array_list.add(124);
		array_list.add('b');
		array_list.add(456);
		array_list.add(null);
		array_list.add(false);
		array_list.add(3);
		System.out.println(array_list);
		
		System.out.println("\n**** Using Iterator ****");
		Iterator arrayList_Iterator = array_list.iterator();
		while(arrayList_Iterator.hasNext() == true)
		{
			System.out.println(arrayList_Iterator.next());
		}
		
		System.out.println("\n**** Using List Iterator ****");
		ListIterator list_iterator = array_list.listIterator();
		while(list_iterator.hasNext() == true)
		{
			System.out.println(list_iterator.next());
		}
		
		System.out.println("\n**** Iterating backwards ****");
		while(list_iterator.hasPrevious())
		{
			System.out.println(list_iterator.previous());
		}
	}
}
