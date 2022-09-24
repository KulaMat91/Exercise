package com.sda.day1.EX5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Polimorfizm
        Employee employee1 = new TeamLeader(); // w klasie TeamLeader mamy dostęp do wszystkich metod z klasy Employee
        employee1.getId();

//        Employee employee2 = new Employee(); // nie można utworzyć obiektu instancji klasy abstrakcyjnych
//        employee2.getId(); // nic nie wyprintuje bo w geterze nie ma sout

        Employee employee3 = new Developer();
        employee3.getId(); // sout z klasy Developer id 2000 , jest zakomendowana ta metoda

        employee3.printEmployeeRole();
        employee1.printEmployeeRole();
        System.out.println("===========================================");

        Adress adress1 = new Adress("Grunwaldzka", "Krakow", 120);
        Adress adress2 = new Adress("Nowa", "Gdanks", 110);

        Company company1 = new Company(1, "Company1", adress1);
        System.out.println(company1);
        Employee employee1Company1 = new TeamLeader(Department.IT.getDepartmentId(), "Jan", "Kowalski", "1245", adress2, Department.IT);
        Employee employee2Company1 = new Developer(Department.IT.getDepartmentId(), "Marek", "Nowak", "1232313", adress2, Department.IT);

        System.out.println(employee1Company1);
        System.out.println(employee2Company1);

        ArrayList<Employee> Company1EmployyeList= new ArrayList<>();
        Company1EmployyeList.add(0,employee1Company1);
        Company1EmployyeList.add(1,employee2Company1);

        company1.setEmployes(Company1EmployyeList);
        System.out.println(company1);

    }
}
