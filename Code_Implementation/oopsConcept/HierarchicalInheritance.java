package oopsConcept;

//parent class
class Employee {
	double salary = 50000;

	void displaySalary() {
		System.out.println("Employee Salary: Rs."+ salary);
	}
}

//child class
class PermanentEmployee extends Employee{
	double hike = 0.50;

	void incrementSalary() {
		salary = salary + (salary * hike);
	} 
}

//child class
class BondBasedEmployee extends Employee{
	double hike = 0.25;

	void incrementSalary() {
		salary = salary + (salary * hike);
	}
}

public class HierarchicalInheritance {
	public static void main(String[] args) {
		// object created
		PermanentEmployee emp1 = new PermanentEmployee();
		BondBasedEmployee emp2 = new BondBasedEmployee();

		System.out.println("Salary of a permanent employee before incrementing:");
		emp1.displaySalary();

		System.out.println("Salary of a bond based employee  before incrementing:");
		emp2.displaySalary();

		// salary incremented
		emp1.incrementSalary();
		emp2.incrementSalary();

		System.out.println("Salary of a permanent employee after incrementing:");
		emp1.displaySalary();

		System.out.println("Salary of a bond based employee after incrementing:");
		emp2.displaySalary();
	}
}

