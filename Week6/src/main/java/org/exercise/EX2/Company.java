package org.exercise.EX2;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private List<Employee> employees;
    private List<Department> departments;
    private Board board;

    public Company(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
        this.departments = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public void companyList() {
        System.out.println("Employee List");
        for (Employee element : this.employees) {
            System.out.println(element);
        }
        System.out.println("Numbers of Employees:" + employees.size());
    }
//    public void addDepartment(Department department) {
//        this.employees.add(department);
//    }
//
//    public void companyList() {
//        System.out.println("Employee List");
//        for (Employee element : this.employees) {
//            System.out.println(element);
//        }
//        System.out.println("Numbers of Employees:" + employees.size());
//    }
}
