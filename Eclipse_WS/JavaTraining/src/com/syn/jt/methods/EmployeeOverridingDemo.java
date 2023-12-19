package com.syn.jt.methods;

public class EmployeeOverridingDemo 
{
	
	public String toString() {
		String objValues = "**************Printing object Values, \nName : " + this.name + "\nEmployee ID : " + this.empID +
				"\nEmployee email " + this.emailID + "\nHead office " + EmployeeOverridingDemo.headoffice
				+ "\n####################################################"; 
		
		return objValues;
	}
	
	// Global Variables , Instance (Object) Variables
	String name;
	String empID;
	String emailID;
	static final String headoffice = "India"; //Govt
	
	public static void main(String[] args) {
		//Create an Object 
		EmployeeOverridingDemo emp1 = new EmployeeOverridingDemo();	
		emp1.name = "Hemant";
		emp1.empID = "EMP123";
		emp1.emailID = "hemant.k@synechron.com";

		System.out.println(emp1);
		
		EmployeeOverridingDemo emp2 = new EmployeeOverridingDemo();
		emp2.name = "S Roy";
		emp2.empID = "EMP124";
		emp2.emailID = "s.roy@synechron.com";
		
		System.out.println(emp2);
		
	}
	
	
}
