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

    public List<Department> getDepartments() {
        return departments;
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public void listAllEmployees() {
        for (Department department : departments) {
            System.out.println(department.nameDepartment() + " employees:");
            for (Employee employee : department.getEmployees()) {
                System.out.println(employee.toString());
            }
            System.out.println("Numbers of Employees:" + department.getEmployees().size());
            System.out.println();
        }
    }

    public void listOfManagers() {
        System.out.println("List of managers: ");
        for (Department department : departments) {
                System.out.println(department.getManager());
        }
    }
    public void getDepartmentWithLeastEmployee(){
        Department leastEmployeeDepartment = null;
        for (int i = 0; i < departments.size() ; i++){
            System.out.println(departments.get(i));
        }
        for (Department department : departments){
            if (leastEmployeeDepartment == null){
                leastEmployeeDepartment = department;
            }
            else {
                if (department.getEmployees().size() < leastEmployeeDepartment.getEmployees().size()){
                    leastEmployeeDepartment = department;
                }
            }
        }
        System.out.println("Department with least employees: " + leastEmployeeDepartment);
    }


    public void companyList() {
        System.out.println("Employee List");
        for (Employee element : this.employees) {
            System.out.println(element);
        }
        System.out.println("Numbers of Employees:" + employees.size());
    }

}
