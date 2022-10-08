package org.exercise.EX2;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private Integer ID;
    protected List<Employee> employees;
    protected Manager manager;

    public Department(Integer ID) {
        this.ID = ID;
        this.employees = new ArrayList<>();
    }

    public Manager getManager() {
        return manager;
    }

    public Integer getID() {
        return ID;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}

