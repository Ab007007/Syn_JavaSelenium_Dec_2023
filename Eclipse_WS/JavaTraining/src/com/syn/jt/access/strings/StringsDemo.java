package com.syn.jt.access.strings;

public class StringsDemo {

	static String email = "aru03.info@gmail.com";
	public static void main(String[] args) 
	{
		String name = "aravind";
		String adderess = new String();
		
		System.out.println("Element at 0 index  --> " + email.charAt(0));
		System.out.println("Length of the string -->  " + email.length());
		System.out.println("Index of a character -->" + email.indexOf("@"));
		System.out.println("Index of a character from first index -->" + email.indexOf("a", 1));
		System.out.println("Last index of a character --> " + email.lastIndexOf("a", 12));
		String[] e = email.split("@");
		
		System.out.println("Split string --> " + e[0]);
		System.out.println("Split string --> " + e[1]);
		
		System.out.println(email.isEmpty());
		email = email.concat(" new email");
		System.out.println(email);
		
		
	}
}
