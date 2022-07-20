package com.bridgelabz;

public class EmployeePayrollData {
    public int id;
    String name;
    int salary;
    public EmployeePayrollData(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee PayRoll Data [id = " +id + ", name = " +name+ " , Salary = " + salary + "]";
    }
}
