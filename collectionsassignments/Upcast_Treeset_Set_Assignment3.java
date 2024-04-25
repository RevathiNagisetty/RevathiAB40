package collectionsassignments;

import java.util.Set;
import java.util.TreeSet;

public class Upcast_Treeset_Set_Assignment3 
{
	public static void main(String[] args) 
	{
		Set tree_set = new TreeSet();
		tree_set.add(45);
		tree_set.add(12);
		tree_set.add(78);
		tree_set.add(345);
		tree_set.add(78);
		tree_set.add(78);
		tree_set.add(78);
		tree_set.add(78);		
		System.out.println(tree_set);		
		System.out.println(tree_set.getClass());
		System.out.println(tree_set.contains(78));
		System.out.println(tree_set.isEmpty());
		System.out.println(tree_set.size());
		tree_set.clear();
		System.out.println(tree_set);
	}

}
