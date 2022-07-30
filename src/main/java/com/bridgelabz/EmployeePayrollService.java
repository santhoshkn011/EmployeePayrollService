package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
    public enum EnumIOService {
        FILE_IO, CONSOLE_IO, DB_IO;
    }

    public List<com.bridgelabz.EmployeePayrollData> employeePayrollList;
    static Scanner sc = new Scanner(System.in);

    /**
     * Declared Constructor To Initialize Class Object
     */
    public EmployeePayrollService(List<com.bridgelabz.EmployeePayrollData> employeePayrollList) {
        this.employeePayrollList = employeePayrollList;
    }
    /**---Method To Read Employee Payroll Data---*/
    ;

    public long readEmployeePayRollData(EnumIOService enumIOService) {

        if (enumIOService.equals(EnumIOService.FILE_IO))
            EmployeePayrollFileIOService.readData();
        return employeePayrollList.size();
    }
    //
    public void writeEmployeePayrollData (EnumIOService enumIOService ) {
        if (enumIOService.equals(EnumIOService.CONSOLE_IO))
            System.out.println("\n Writing Employee Payroll Roaster to Console\n" + employeePayrollList);
        else if (enumIOService.equals(EnumIOService.FILE_IO))
            new EmployeePayrollFileIOService().writeData(employeePayrollList);
    }


//        /**---Method to Add Data to the File---*/
//        public void AddDataToFile (List < EmployeePayrollData > employeeData) {
//            File file = new File("//home//asus//IdeaProjects//EmployeePayrollService//src//Test.txt");
//            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))) {
//                bufferedWriter.write(String.valueOf(employeeData));
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }

    public static void main(String[]args){
        System.out.println("Welcome to the Employee Payroll service JDBC :-) ");
        ArrayList<com.bridgelabz.EmployeePayrollData> employeepayrollList = new ArrayList<>();
        // taking the object of main class and calling the read and write method into main method
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeepayrollList);
        Scanner sc = new Scanner(System.in);
        //Function Calling
        employeePayrollService.readEmployeePayRollData(EnumIOService.CONSOLE_IO);
        employeePayrollService.writeEmployeePayrollData(EnumIOService.FILE_IO);
    }
    public static void printData(EnumIOService enumIOService) {
        if (enumIOService.equals(EnumIOService.FILE_IO))
            new EmployeePayrollFileIOService().printData();
    }
    public static long countEntries(EnumIOService enumIOService) {
        if (enumIOService.equals(EnumIOService.FILE_IO))
            new EmployeePayrollFileIOService().countEntries();
        return 0;
    }
}