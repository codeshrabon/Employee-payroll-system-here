package Employee;

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

}
