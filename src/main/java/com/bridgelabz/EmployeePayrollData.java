package com.bridgelabz;

public class EmployeePayrollData {
    public int id;
    public String name;
    public int salary;
    public String startdate;


    public EmployeePayrollData(int id, String name, double salary, String startdate) {
        this.id = id;
        this.name = name;
        this.salary = (int) salary;
        this.startdate = String.valueOf(startdate);
    }

    @Override
    public String toString() {
        return "Employee PayRoll Data [id=" + id + ", name = " + name + ", Salary = " + salary + ",Start_date " + startdate + " ]";
    }
}