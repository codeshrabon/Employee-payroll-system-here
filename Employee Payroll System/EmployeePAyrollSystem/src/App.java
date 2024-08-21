import java.util.ArrayList;

abstract class Employee {
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

}

class FUllTimeEmployee extends Employee {
    private double monthlySalary;

    // creating cosntructor of FullTimeEmployee
    public FUllTimeEmployee(String name, int id, double monthlySalary) {
        // using super keyword to excess the super-class/parent-class constructor
        // variable
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double CalculateSalary() {

        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    // constructor
    public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double CalculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

class PayrollSystem {
    // Employee is the member of Employee class
    private ArrayList<Employee> employeeList;

    public PayrollSystem() {
        employeeList = new ArrayList<>();
    }

    // adding employee .. and also when add emplyee then those need some space to be
    // feet in
    // emplueeList is array objective so employee object which created in
    // Addemployee method are
    // added init...
    public void addEmployee(Employee employee) {
        // this is the inbuild implementation to add object
        employeeList.add(employee);
    }

    public void removeEmployee(int id) {
        // create a variable of Employee
        Employee employeeToRemove = null;
        for (Employee employee : employeeList) {
            // employee is Employe types obejct and
            // getId is to compare with removeEmployee(int id)
            if (employee.getId() == id) {
                employeeToRemove = employee;
                break;

            }

        }
        if (employeeToRemove != null) {
            employeeList.remove(employeeToRemove);

        }

    }

    public void diplayEmployees() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}

public class App {
    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();
        FUllTimeEmployee emp1 = new FUllTimeEmployee("Shrabone", 01, 45000.0);
        PartTimeEmployee emp2 = new PartTimeEmployee("Rassell", 10, 7, 100.0);

        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);

        System.out.println("Initial Employee Deatails : ");
        payrollSystem.diplayEmployees();

        System.out.println("Removing Employee");
        payrollSystem.removeEmployee(10);

        System.out.println("Remaining Employee Details: ");
        payrollSystem.diplayEmployees();

    }
}
