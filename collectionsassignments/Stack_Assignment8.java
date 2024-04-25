package collectionsassignments;

import java.util.Stack;

public class Stack_Assignment8 {

	public static void main(String[] args)
	{
		Stack s = new Stack();
		s.push(345);
		s.push("Revathi");
		s.push("Revathi");
		s.push("Devi");
		s.push('C');
		s.push(true);
		s.push(56);
		s.push(234);
		System.out.println(s);		
		s.pop();		
		System.out.println(s);	
		System.out.println(s.peek());		
		System.out.println(s.empty());
		s.clear();
		System.out.println(s.search("Devi"));		
	}
}
