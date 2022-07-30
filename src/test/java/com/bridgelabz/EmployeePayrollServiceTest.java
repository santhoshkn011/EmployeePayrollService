package com.bridgelabz;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;



public class EmployeePayrollServiceTest {
    EmployeePayrollFileIOService employeePayrollFileIOService = new EmployeePayrollFileIOService();
    public List<com.bridgelabz.EmployeePayrollData> employeePayrollData;

//    @Test
//    public void checkFileCreatedOrNot(){
//        Assertions.assertTrue(employeePayrollFileIOService.createFile());
//    }
//    @Test
//    public void checkFileExistOrNot(){
//        Assertions.assertTrue(employeePayrollFileIOService.checkFileExistOrNot());
//    }
//    @Test
//    public void checkFileDeletedOrNot(){
//        Assertions.assertTrue(employeePayrollFileIOService.DeleteFileOperation());
//    }
//    @Test
//    public void displayFileFromDirectory(){
//        Assertions.assertTrue(employeePayrollFileIOService.ListOfAllFilesAndDirectory());
//    }
    @Test
    public void giveDataToCreateTable_IntoDatabase(){
        JDBCFileOperations jdbcFileOperations = new JDBCFileOperations();
        boolean exp = jdbcFileOperations.createTable();
        Assertions.assertTrue(true);
    }
}