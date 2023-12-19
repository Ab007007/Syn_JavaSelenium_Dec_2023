package com.syn.jt.access.loops;

public class ForLoopDemo {

	
	public static void main(String[] args) 
	{
		int num = 5;
		
		for (int i = 1; i <=20 ; i++) 
		{
			System.out.println(num + " * " + i + " = " + (num * i));
		}
		
		int i = 1;
		System.out.println("Printing table from while loop");
		while(i<=10)
		{
			System.out.println(num + " * " + i + " = " + (num * i));
		
			i++;
		}
		
		
		System.out.println("Printing table from do, while loop");
		
		int j = 11;
		do {
			System.out.println(num + " * " + j + " = " + (num * j));
			j++;
		}while(j<=10);
		
		
		
		
		
		
	}
}
