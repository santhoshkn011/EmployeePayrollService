package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 Create an Employee
 Payroll Service to Read
 and Write Employee
 Payroll to a Console - Create Employee Payroll Class of id, name and Salary
 */
public class EmployeePayrollService {
    public List<EmployeePayrollData>employeePayrollList;
    public EmployeePayrollService (List<EmployeePayrollData> employeePayrollData){
        this.employeePayrollList=employeePayrollData;
    }
// Create the Read Employee payroll Method
    public void readEmployeePayRoll(){
        // taking user input of id , name , Salary by scanner class
        Scanner sc = new Scanner(System.in);
        int id;
        String name;
        int Salary;
        System.out.println("Enter the Employee id :- " );
        id = sc.nextInt();
        System.out.println("Enter the Employee Name :- ");
        name = sc.next();
        System.out.println("Enter the Employee Salary :- ");
        Salary = sc.nextInt();
        employeePayrollList.add(new EmployeePayrollData(id,name,Salary));
    }
    //Create to Write Employee payroll Data Method and passing the message and print employeePayrolllist
    public void writeEmployeepayrollData(){
        System.out.println("\nWriting Employee Payroll Service in Console\n" + employeePayrollList );
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Payroll Service project :-) ");
        ArrayList<EmployeePayrollData> employeepayrollList = new ArrayList<>();
        // taking the object of main class and calling the read and write method into main method
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeepayrollList);
        employeePayrollService.readEmployeePayRoll();
        employeePayrollService.writeEmployeepayrollData();
    }
}
