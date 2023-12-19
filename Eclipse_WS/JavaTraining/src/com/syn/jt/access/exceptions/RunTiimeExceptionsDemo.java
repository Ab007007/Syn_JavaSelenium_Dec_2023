package com.syn.jt.access.exceptions;

public class RunTiimeExceptionsDemo 
{
	
	public static void main(String[] args) 
	{
		System.out.println("main started ");
		String names[] = {"Aravinda" , "Harry" , "Arun" ,"Jiffy"};
		
		for (int i = 0; i <= names.length; i++) 
		{
			try
			{
				System.out.println(names[i]);
			}
			catch(ArrayIndexOutOfBoundsException ex)
			{
				System.out.println("Please check the array logic " + ex.getMessage());
			}
			
		}
		
		System.out.println("main ended");
		
	}

}
