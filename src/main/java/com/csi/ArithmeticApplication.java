package com.csi;

public class ArithmeticApplication {
	public static void main(String[] args) {
		
		System.out.println("\n Addition Result: "+add(5,5));
		System.out.println("\n Substraction Result: "+sub(15,5));
		System.out.println("\n Multiplication Result: "+mul(5,5));
		System.out.println("\n Division Result: "+div(5,5));
		
	}

	public static int add(int n1, int n2)
	{
		return n1+n2;
	}
	
	public static int sub(int n1, int n2)
	{
		return n1-n2;
	}
	
	public static int mul(int n1, int n2)
	{
		return n1*n2;
	}
	
	public static int div(int n1, int n2)
	{
		return n1/n2;
	}
}
