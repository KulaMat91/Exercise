package org.exercise.EX2;

public class Employee {
    private String name;
    private String surname;
    private EmployeeRole employeeRole;
    private Integer ID;

    public Employee(String name, String surname, EmployeeRole employeeRole, Integer ID) {
        this.name = name;
        this.surname = surname;
        this.employeeRole = employeeRole;
        this.ID = ID;
    }

//    public Employee(String name, String surname, EmployeeRole employeeRole) {
//    }

    public Integer getID(){
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public EmployeeRole getEmployeeRole() {
        return employeeRole;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", employeeRole=" + employeeRole +
                ", ID=" + ID +
                '}';
    }
}

