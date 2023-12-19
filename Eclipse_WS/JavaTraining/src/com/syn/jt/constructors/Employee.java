package com.syn.jt.constructors;

public class Employee 
{
	// Global Variables , Instance (Object) Variables
	String name;
	String empID;
	String emailID;
	static final String headoffice = "India"; //Govt
	
	public Employee(String name, String empID, String emailID) 
	{
		this.name = name;
		this.empID = empID;
		this.emailID = emailID;
	}
	
	public Employee()
	{
		System.out.println("calling default constructor");
	}
	
	public static void main(String[] args) {
		Employee emp1 = new Employee("Aravind", "abc123", "emp1@abc.com");
		Employee emp2 = new Employee("Hemant", "abc124", "emp2@abc.com");
		
		Employee emp3 = new Employee();
		
		printEmployeeInformation(emp1);
		printEmployeeInformation(emp2);
		printEmployeeInformation(emp3);
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
