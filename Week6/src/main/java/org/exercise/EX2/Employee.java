package org.exercise.EX2;

public class Employee {
    private String name;
    private String surname;
    private EmployeeRole employeeRole;
    private Integer ID;

    public Employee(String name, String surname, EmployeeRole employeeRole) {
        this.name = name;
        this.surname = surname;
        this.employeeRole = employeeRole;
    }
    public Integer getID(){
        return ID;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "name = '" + name + '\'' +
                ", surname = '" + surname + '\'' +
                ", employeeRole = " + employeeRole +
                '}';
    }
}

