package Employee;

import java.util.Arrays;
import java.util.List;

public abstract class Employee {
    private String name;
    private int id;

    // creating an constructor
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // using incapsulation to getname of the employee
    // using getName to avoid direct access

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    // abstraction only be atchive by abstract class & abstract method
    // abstract method is only to declared
    public abstract double CalculateSalary();

    @Override

    // when i call toString then it will show like this
    public String toString() {
        return "Employee [name = " + name + " , id = " + id + " , salary = " + CalculateSalary() + "]";
    }

    // creating a list of Employee
    List<Employee> employeeList = Arrays.asList();
    FullTimeEmployee emp1 = new FullTimeEmployee("Shrabone", 01, 45000.0);

    PartTimeEmployee emp2 = new PartTimeEmployee("Rassell", 10, 7, 100);
}
