package org.exercise.EX2;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private Integer ID;
    protected List<Employee> employees;
    protected Manager manager;

    public Department(Integer ID, Manager manager) {
        this.ID = ID;
        this.manager = manager;
        this.employees = new ArrayList<>();
    }

    public Manager getManager() {
        return manager;
    }

    public Integer getID() {
        return ID;
    }

    public String nameDepartment() {
        return "Department " + ID;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "ID = " + ID +
                ", employees = " + employees +
                '}';
    }
}

