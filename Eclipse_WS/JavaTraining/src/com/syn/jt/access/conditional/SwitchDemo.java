package com.syn.jt.access.conditional;

public class SwitchDemo {

	
	public static void main(String[] args) {
		String grade = "a" ;
		switch (grade.toUpperCase()) 
		{
		case "A":
			System.out.println("total marks is above 500");
			break;
		case "B":
			System.out.println("total marks is above 450");
			break;
		case "C":
			System.out.println("total marks is above 400");
			break;
		case "D":
			System.out.println("total marks is above 350");
			break;

		default:
			System.out.println("Better luck next time");
			break;
		}
	}
}
