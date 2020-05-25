package org.hcl.test;

public class Base extends Sample{
	public  void parentmethod() {
		System.out.println("Parent method");
		System.out.println("Parent method 2");
		System.out.println("Parent method 3");
	}
	public static void main(String[] args) {
		Sample b=new Base();
		b.parentmethod();
	}
}
