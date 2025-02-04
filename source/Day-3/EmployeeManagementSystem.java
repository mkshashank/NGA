/*. Abstraction:Question:
Design an Employee Management System where you create an abstract class Employee with abstract methods like calculateSalary() and displayDetails(). Create two derived classes,
FullTimeEmployee and PartTimeEmployee, and implement the abstract methods. For FullTimeEmployee, calculate salary as a fixed monthly rate, and for PartTimeEmployee, calculate
salary based on hourly rates. Demonstrate polymorphism by creating an array of Employee objects and calculating/displaying salaries using overridden methods.*/
abstract class Employee
{
	int salary;

	public abstract void calculateSalary();
	public abstract void displayDetails();

	public Employee()
	{

	}

	public Employee(int salary)
	{
		this.salary = salary;
	}
}

class FullTimeEmployee extends Employee
{
	int salary;
	public void calculateSalary()
	{
		this.salary = super.salary * 12;
	}

	public void displayDetails()
	{
		System.out.println(this.salary);
	}

	public FullTimeEmployee()
	{

	}

	public FullTimeEmployee(int salary)
	{
		super.salary = salary;
	}
}

class PartTimeEmployee extends Employee
{
	int salary;
	public void calculateSalary()
	{
		this.salary = super.salary * 30 * 12;
	}

	public void displayDetails()
	{
		System.out.println(this.salary);
	}

	public PartTimeEmployee()
	{

	}

	public PartTimeEmployee(int salary)
	{
		super.salary = salary;
	}
}

public class EmployeeManagementSystem
{
	public static void main(String[] args)
	{
		FullTimeEmployee fte = new FullTimeEmployee(30000);
		fte.calculateSalary();
		fte.displayDetails();
		PartTimeEmployee pte = new PartTimeEmployee(1000);
		pte.calculateSalary();
		pte.displayDetails();
	}
}