package com.sda.day1.EX5;

import java.util.ArrayList;
import java.util.Objects;

//Napisz klase Company.
//Dodaj pola 'id', name oraz adreess typu Address oraz employees jako ArrayList.
//Dodaj setery, gettery oraz metode toString()
public class Company {
    private int id;
    private String name;
    private Adress adress;

    private ArrayList<Employee> employees;

    public Company() {
    }

    public Company(int id, String name, Adress adress) {
        this.id = id;
        this.name = name;
        this.adress = adress;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public void setEmployes(ArrayList<Employee> employeess) {
        this.employees = employeess;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Adress getAdress() {
        return adress;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", adress=" + adress +
                ", employees=" + employees +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return id == company.id && Objects.equals(name, company.name)
                && Objects.equals(adress, company.adress)
                && Objects.equals(employees, company.employees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, adress, employees);
    }
}
