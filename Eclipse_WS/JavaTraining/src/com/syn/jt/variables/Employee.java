package com.syn.jt.variables;

public class Employee 
{
	// Global Variables , Instance (Object) Variables
	String name;
	String empID;
	String emailID;
	static final String headoffice = "India"; //Govt
	
	public static void main(String[] args) {
		//Create an Object 
		Employee emp1 = new Employee();	
		emp1.name = "Hemant";
		emp1.empID = "EMP123";
		emp1.emailID = "hemant.k@synechron.com";
		//emp1.headoffice = "USA";
		printEmployeeInformation(emp1);

		Employee emp2 = new Employee();
		emp2.name = "S Roy";
		emp2.empID = "EMP124";
		emp2.emailID = "s.roy@synechron.com";
		printEmployeeInformation(emp2);
	}
	
	public static void printEmployeeInformation(Employee emp) {
		System.out.println("************ Employee Details are **************");
		System.out.println("Name " + emp.name);
		System.out.println("Emp ID " + emp.empID);
		System.out.println("EmailID " + emp.emailID);
		System.out.println("Headoffice  " + emp.headoffice);
		System.out.println("#################################################");
	}
}
