package org.hcl.test;

public class Base extends Sample{
	public  void parentmethod() {
		System.out.println("Parent method");
		System.out.println("Child method 1");
		System.out.println("Child method 2");
	}
	public static void main(String[] args) {
		Sample b=new Base();
		b.parentmethod();
	}
}
