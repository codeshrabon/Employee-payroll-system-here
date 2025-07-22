
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Employee.PayrollSystem;
import Employee.Employee;
import Employee.FullTimeEmployee;
// import Employee.PartTimeEmployee;
// import Employee.PayrollSystem;
import Employee.PartTimeEmployee;


public class App {
    public static void main(String[] args) {
        /* PayrollSystem payrollSystem = new PayrollSystem();
        

 */
        
        PayrollSystem payrollSystem = new PayrollSystem();

        
    
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
