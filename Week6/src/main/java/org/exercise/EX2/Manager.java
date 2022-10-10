package org.exercise.EX2;

public class Manager extends Employee{
    public Department department;
    public Manager(String name, String surname, EmployeeRole employeeRole ,Integer ID) {
        super(name, surname, employeeRole, ID);

    }



    @Override
    public String toString() {
        return "Manager{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", employeeRole=" + getEmployeeRole() +
                ", ID=" + getID() +
                '}';
    }
}
