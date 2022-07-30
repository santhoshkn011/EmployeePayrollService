package com.bridgelabz;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class EmployeePayrollFileIOService {
    public static String Test="Test.txt";
    public static void readData() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(Test)));
            String data;
            while ((data = bufferedReader.readLine()) != null) {
                System.out.println(data);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("ERROR: unable to read file " + Test);
            e.printStackTrace();
        }
    }
    public static void writeData(List<com.bridgelabz.EmployeePayrollData> employeePayrollList) {
        StringBuffer buffer = new StringBuffer();
        employeePayrollList.forEach(employee -> {
            String employeeDataString = employee.toString().concat("\n");
            buffer.append(employeeDataString);
        });
        try {
            Files.write(Paths.get(Test), buffer.toString().getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    /**---Method To Create New File to particular Directory---
     */
    public boolean createFile(){
        File file = new File("C:\\Users\\santh\\IdeaProjects\\EmployeePayRollService\\src\\main\\resources\\Test.txt");
        try {
            if (file.createNewFile()){
                System.out.println("File is created " + file.getName());
                return true;
            }else {
                System.out.println("File is not created !! File is already exists");
                return false;
            }
        }catch (IOException e){
            System.out.println("Exception ");
            return false;
        }
    }

    /**---Method to Check file is Already exist or Not---
     */
    public boolean checkFileExistOrNot(){
        try {
            File file = new File("C:\\Users\\santh\\IdeaProjects\\EmployeePayRollService\\src\\main\\resources\\Test.txt");
            if (file.exists()){
                System.out.println("File is Already Exists");
                return true;
            }else {
                file.createNewFile();
                System.out.println(" New File is created");
                return false;
            }
        }catch (IOException e){
            System.out.println("Exception");
            return false;
        }
    }

    /**---Method to Delete the file from particular Directory---
     */
    public boolean DeleteFileOperation(){
        File file = new File("C:\\Users\\santh\\IdeaProjects\\EmployeePayRollService\\src\\main\\resources\\Test.txt");
        if (file.delete()){
            System.out.println(file.getName()+"File is deleted");
            return true;
        }else {
            System.out.println(file.getName()+"File is not exists to Delete");
            return false;
        }
    }
    /**---Method to List All the Files and Directories---
     */
    public boolean ListOfAllFilesAndDirectory(){
        File file = new File("C:\\Users\\santh\\IdeaProjects\\EmployeePayinsert into employee_payroll(name,salary,start)VALUES('Bill',1000000.00,'2010-10-30'),('Tersia',2000000.00,'2019-11-13'),('Charlie',300000.00,'2020-05-21')rollService\\src");
        File [] files;
        String [] FilesNames;
        files = file.listFiles();
        FilesNames = file.list();
        if(FilesNames.length==0){
            System.out.println("Directory Is Empty !!!");
            return false;
        }else {
            //Display Files With Directory
            System.out.println("\nFile Names With Directories\n");
            for (File s1 : files) {
                System.out.println(s1);
            }
            //Display Folders Name and Files With Extension
            System.out.println("\nFile Name With extension and Folder Names Available In Directory\n");
            for (String filename : FilesNames) {
                System.out.println(filename);
            }
            return true;
        }
    }


    public static void printData() {
        try {
            Files.lines(new File("Test.txt").toPath())
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public long countEntries() {
        long entries = 0;
        try {
            entries = Files.lines(new File("Test.txt").toPath()).count();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return entries;
    }
}