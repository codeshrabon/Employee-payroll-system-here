package Employee;

import java.util.ArrayList;


public class PayrollSystem {
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
