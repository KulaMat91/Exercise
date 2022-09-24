package com.sda.day1.EX5;

// Dziedziczenie klasy Employee, klase może dziedziczycć tylko po jednej klasie
public class TeamLeader extends Employee {
    public TeamLeader() {
        super();
        super.setEmployeeRole(EmployeeRole.TEAM_LEADER);
    }

    public TeamLeader(int id, String name, String surname, String pesel, Adress adress, Department department) {
        super(id, name, surname, pesel, adress, department, EmployeeRole.TEAM_LEADER);
    }

    // odowjuje się do metody abstrakycjne printEmployeeRole z Employee, trzeba ja napisac aby nie robic z klasy TeamLeader klasy abstract
    public void printEmployeeRole() {
        System.out.println("Team Leader: " + super.getEmployeeRole());
    }

    @Override
    public boolean doWork() {
        return true;
    }

    @Override
    public String toString() {
        return "TeamLeader{} " + super.toString();
    }
    //    @Override // nadpisuje z klasy Employee
//    public int getId() {
//        System.out.println("Team Leader: " + 1000);
//        return 1000;
//    }
}
