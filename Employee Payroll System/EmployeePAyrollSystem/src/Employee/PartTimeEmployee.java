package Employee;

public class PartTimeEmployee extends Employee {
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

