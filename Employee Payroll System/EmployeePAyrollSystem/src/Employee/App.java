package Employee;
import java.util.ArrayList;


public class App {
    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();
        FUllTimeEmployee emp1 = new FUllTimeEmployee("Shrabone", 01, 45000.0);
        PartTimeEmployee emp2 = new PartTimeEmployee("Rassell", 10, 7, 100.0);


        //PayrollSystem paymentSystem = new Payroll
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
