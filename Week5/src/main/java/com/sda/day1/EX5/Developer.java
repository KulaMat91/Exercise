package com.sda.day1.EX5;

public class Developer extends Employee {

    public Developer() {
        super();
        super.setEmployeeRole(EmployeeRole.JAVA_DEVELOPER);
    }

    public Developer(int id, String name, String surname, String pesel, Adress adress, Department department) {
        super(id, name, surname, pesel, adress, department, EmployeeRole.JAVA_DEVELOPER);
    }

    // odowjuje się do metody abstrakycjne printEmployeeRole z Employee, trzeba ja napisac aby nie robic z klasy Developer klasy abstract
    public void printEmployeeRole() {
        System.out.println("Developer: " + super.getEmployeeRole());
    }

    //Trzeba napdpisć tą metodę z implementacji Workable, która była zaimplmentowana do klasy abstrakcyjne Empoyee
    @Override
    public boolean doWork() {
        return true;
    }

    @Override
    public String toString() {
        return "Developer{} " + super.toString();
    }
    //    @Override // nadpisuje z klasy Employee
//    public int getId() {
//        System.out.println("Developer: " + 2000);
//        return 2000;
//    }
}
