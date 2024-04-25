package javaassignments;

import java.util.Date;

public class Date_Assignement18 
{
	public static void main(String[] args) 
	{	
		Date d = new Date();		
		Date futuredate_10days = new Date(d.getTime()+(1000*60*60*24*10));
		System.out.println(futuredate_10days);
	}	
}
