package collectionsassignments;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class Iterator_Treeset_Assignment6 
{
	public static void main(String[] args)
	{
		Set tree_set = new TreeSet();
		tree_set.add("Revathi");
		tree_set.add("Devi");
		tree_set.add("Rev");
		tree_set.add("234");
		tree_set.add("456");
		tree_set.add("456");
		System.out.println(tree_set);
		
		Iterator it = tree_set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}	
		
		//Iteration is not possible with List Iterator
		//ListIterator lt = tree_set.
		
	}
}
