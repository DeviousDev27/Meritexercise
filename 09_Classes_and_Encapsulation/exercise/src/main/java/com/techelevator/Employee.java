package com.techelevator;

public class Employee {
    private int employeeId;
    private String firstName, lastName, fullName, department;
    private double annualSalary;

    public int getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        fullName = lastName + ", " + firstName;
        return fullName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }


    public Employee(int employeeId, String firstName,String lastName, double annualSalary){
        this.firstName = firstName;
        this.employeeId = employeeId;
        this.lastName = lastName;
        this.annualSalary = annualSalary;
    }

    public void raiseSalary(double percent){
        this.annualSalary = (annualSalary) + (annualSalary * (percent/100));

    }





}
