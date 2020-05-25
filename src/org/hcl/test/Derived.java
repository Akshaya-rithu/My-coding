package org.hcl.test;

public class Derived  {

public static void main(String[] args) {
	System.out.println(2);
	System.out.println(6);
	try {
	System.out.println(10/2);
			try {
			String s="Akshaya";
			System.out.println(s.charAt(11));
		}
		catch(NullPointerException e)
		{
			System.out.println("Null string");
		}
		finally
		{
			System.out.println("Innerfinal");
		}
	}
	catch(Exception e)
	{
		System.out.println("Superclass");
	}
	finally
	{
		System.out.println("Final block");
	}
	System.out.println(7);
	System.out.println(9);
	System.out.println(3);
	
}


}
