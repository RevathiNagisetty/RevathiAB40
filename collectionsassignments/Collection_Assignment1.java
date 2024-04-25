package collectionsassignments;
import java.util.*;

public class Collection_Assignment1 
{
	public static void main(String[] args) 
	{
		/*ArrayList
		  --Follows Indexing and order of insertion
		  --Allows Duplicates
		  --Accepts any number of null values
		  --Dynamic in nature
		  --Allows heterogeneous values		  
		  --We can sort if homogeneous*/
		List array_list = new ArrayList();
		array_list.add(123);
		array_list.add(34);
		array_list.add("Revathi");
		array_list.add("Devi");
		array_list.add('c'); 
		array_list.add(null);
		array_list.add(null);
		array_list.add(null);
		array_list.add(34);
		System.out.println("Array List --" + array_list);
		
		
		/* Vector
		  --Follows Indexing and order of insertion
		  --Allows Duplicates
		  --Accepts any number of null values
		  --Dynamic in nature
		  --Allows heterogeneous values		  
		  --We can sort if homogeneous*/
		List vector_list = new Vector();
		vector_list.add(123);
		vector_list.add(34);
		vector_list.add("Revathi");
		vector_list.add("Devi");
		vector_list.add('c');
		vector_list.add(null);
		vector_list.add(null);
		vector_list.add(null);
		vector_list.add(34);
		System.out.println("Vector List --" + vector_list);
		//Collections.sort(vector_list);
		
		/* LinkedList
		  --Follows Indexing and order of insertion
		  --Allows Duplicates
		  --Accepts any number of null values
		  --Dynamic in nature
		  --Allows heterogeneous values		  
		  --We can sort if homogeneous*/
		List linkedlist = new LinkedList();		
		linkedlist.add(123);
		linkedlist.add(34);
		linkedlist.add("Revathi");
		linkedlist.add("Devi");
		linkedlist.add('c');
		linkedlist.add(null);
		linkedlist.add(null);
		linkedlist.add(null);
		linkedlist.add(34);
		
		//linkedlist.add(34);
		System.out.println("Linked List --" + linkedlist);
		
		/* TreeSet
		  --Doesn't Follows Indexing and order of insertion
		  --Doesn't allow Duplicate values
		  --cannot accept null values
		  --Dynamic in nature
		  --Allows only homogeneous values		  
		  --Sorted*/
		TreeSet tree_set = new TreeSet();		
		tree_set.add(123);
		tree_set.add(34);
		tree_set.add(347667);
		//tree_set.add("Revathi");
		//tree_set.add("Revathi");
		//tree_set.add("Devi");
		//tree_set.add('c');
		//tree_set.add(null);
		//tree_set.add(null);
		//tree_set.add(null);
		tree_set.add(34);
		tree_set.add(34);
		tree_set.add(1);
		
		System.out.println("Tree Set --" + tree_set);
		
		/* Priority Queue
		  --Doesn't Follows Indexing and order of insertion
		  --Allows Duplicate values
		  --cannot accept null values
		  --Dynamic in nature
		  --Allows only homogeneous values		  
		  --Not Sorted*/
		Queue priority_queue = new PriorityQueue();		
		priority_queue.add(123);
		priority_queue.add(34);
		priority_queue.add(347667);
		//priority_queue.add("Revathi");
		//priority_queue.add("Devi");
		//priority_queue.add('c');
		//priority_queue.add(null);
		//priority_queue.add(null);
		//priority_queue.add(null);
		priority_queue.add(34);
		priority_queue.add(34);
		System.out.println("Priority Queue --" + priority_queue);		
	}
}
