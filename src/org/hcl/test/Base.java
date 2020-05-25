package org.hcl.test;

public class Base extends Sample{
	public  void parentmethod() {
		System.out.println("Parent method");
	}
	public static void main(String[] args) {
		Sample b=new Base();
		b.parentmethod();
	}
}
