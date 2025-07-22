package Employee;


public class FullTimeEmployee extends Employee {
    private double monthlySalary;


    // creating constructor of FullTimeEmployee
    public FullTimeEmployee(String name,int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }
    

    @Override
    public double CalculateSalary() {

        return monthlySalary;
    }
}
