package com.bridgelabz;

import org.junit.jupiter.api.Test;


import java.util.List;

public class EmployeeServiceTestDB {
    private EmployeePayrollService employeePayrollService;

    @Test

    public void givenEmployeeWhenWrittenToFileShouldMatchEmployeeEntries() {
        com.bridgelabz.EmployeePayrollData[] employeePayrollData = {
                new com.bridgelabz.EmployeePayrollData(101, "Santhosh", 30000, "11-02-2022"),
                new com.bridgelabz.EmployeePayrollData(102, "Aravind", 20000, "01 -01 -2020"),
                new com.bridgelabz.EmployeePayrollData(103, "Durga", 25000, "20 -01 -2021")};
        EmployeePayrollFileIOService.writeData(List.of(employeePayrollData));
        employeePayrollService.printData(EmployeePayrollService.EnumIOService.FILE_IO);
        employeePayrollService.countEntries(EmployeePayrollService.EnumIOService.FILE_IO);
        System.out.println("No. of entries: " + employeePayrollData.length);
    }

}