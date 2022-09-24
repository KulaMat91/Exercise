package com.sda.day1.EX5;

import java.util.Objects;

//Napisz klase Employee.
//Dodaj pola id, name, surname, pesel, address typu Address department,
//Dodaj setery, gettery oraz metode toString()
public abstract class Employee implements Workable {
    private int id;
    private String name;
    private String surname;
    private String pesel;
    private Adress adress;

    private Department department;

    private EmployeeRole employeeRole;

    public Employee() {
    }


    public Employee(int id, String name, String surname, String pesel, Adress adress, Department department, EmployeeRole employeeRole) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        this.adress = adress;
        this.department = department;
        this.employeeRole = employeeRole;
    }

    @Override
    public boolean doWork() {
        return true;
    }

    public abstract void printEmployeeRole();


    public Department getDepartment() {
        return department;
    }

    public Adress getAdress() {
        return adress;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPesel() {
        return pesel;
    }

    public EmployeeRole getEmployeeRole() {
        return employeeRole;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setEmployeeRole(EmployeeRole employeeRole) {
        this.employeeRole = employeeRole;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", pesel='" + pesel + '\'' +
                ", adress=" + adress +
                ", department=" + department +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id
                && Objects.equals(name, employee.name)
                && Objects.equals(surname, employee.surname)
                && Objects.equals(pesel, employee.pesel)
                && Objects.equals(adress, employee.adress)
                && department == employee.department;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, pesel, adress, department);
    }
}
