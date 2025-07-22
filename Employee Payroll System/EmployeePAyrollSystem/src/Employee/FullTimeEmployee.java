package Employee;

public class FullTimeEmployee {
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
}
