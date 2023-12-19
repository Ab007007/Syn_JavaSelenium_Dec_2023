package com.syn.jt.inheritance;

public class Person {
	
	public String name;
	public double height;
	public double weight;
	public int age;
	public static final String country = "India";
	

	public String toString() {
		String details = "Personal Details are , \nName : " + this.name + "\nHeight : " + this.height
				 + "\nWeight : " + this.weight  + "\nAge : " + this.age + "\nCountry : " + Person.country ;
		return details;
	}
	
	public boolean hasVoterID()
	{
		boolean flag = false;
		
		if(this.age >=18)
			flag = true;
		
		return flag;
	}
	
	public boolean hasMobile()
	{
		boolean flag = false;
		
		if(this.age >=15)
			flag = true;
		
		return flag;
	}
	
	

}
