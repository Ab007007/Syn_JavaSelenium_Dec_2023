package com.syn.jt.inheritance;

public class Employee extends Person implements WelcomeMessage, printBirthYear
{
	String empID;
	String empEmail;
	String company;
	String companyAddress;

	
	@Override
	public void greetUser() {
		System.out.println("Welcome to the Employee Info Class\n********************************");
		
	}
	@Override
	public String toString() {
		greetUser();
		String details = super.toString() + 
				"Employee details, \nEmployeeID : " + this.empID +
				"\nEmployee Email : " + this.empEmail +
				"\nEmployee Company : " + this.company + 
				"\nEmployee Company Address : " + this.companyAddress;
		return details;
	}
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.name = "Aravinda";
		emp1.height = 5.8;
		emp1.weight = 74;
		emp1.age = 40;
		emp1.empID = "emp1234";
		emp1.empEmail = "emp123@synechron.com";
		emp1.company = "Synechron";
		emp1.companyAddress = "Bangalore";
		
		
		System.out.println(emp1);
		
		System.out.println(emp1.hasVoterID());
		System.out.println(emp1.hasMobile());
		emp1.printBirthYearOfAPerson(emp1.age);
		
	}
	@Override
	public void printBirthYearOfAPerson(int age) {
		System.out.println("Birth Year of a person is " + (2023 - this.age));
		
	}
}
