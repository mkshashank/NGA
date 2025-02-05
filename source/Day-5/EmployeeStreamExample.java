/*Given a list of employees, each with a name, age, and salary, write a Java program using the Streams API to: 
Filter employees who are older than 30.
Find the average salary of employees who meet the age condition.
Collect the names of these employees into a List.
Print the list of employee names and the average salary.
Hint: Use filter(), map(), collect(), and average() methods from Streams*/
import java.util.*;
import java.util.stream.Collectors;

public class EmployeeStreamExample 
{
    public static void main(String[] args) 
    {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 28, 50000),
                new Employee("Bob", 35, 70000),
                new Employee("Charlie", 40, 80000),
                new Employee("David", 25, 45000),
                new Employee("Eve", 32, 60000)
        );

        List<Employee> filteredEmployees = employees.stream()
                .filter(emp -> emp.getAge() > 30)
                .collect(Collectors.toList());

        List<String> employeeNames = filteredEmployees.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());

        double averageSalary = filteredEmployees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);

        System.out.println("Employees older than 30: " + employeeNames);
        System.out.println("Average Salary of Employees Older Than 30: " + averageSalary);
    }
}

class Employee
{
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) 
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() 
    {
        return name;
    }

    public int getAge() 
    {
        return age;
    }

    public double getSalary() 
    {
        return salary;
    }
}
