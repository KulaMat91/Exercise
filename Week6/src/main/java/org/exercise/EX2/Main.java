package org.exercise.EX2;



import java.util.Arrays;
import java.util.stream.Collectors;

//Zadanie 2: Firma
//Stwórz hierarchię klas reprezentującą hierarchię w dużej firmie.
// Firma ma departamenty, a każdy departament ma menedżera i pracowników (menedżer też jest pracownikiem).
// Firma ma jeden specjalny departament - zarząd - który zarządza wszystkimi jej departamentami, a jej menedżer to prezes firmy.
// Zaimplementuj metody, za pomocą których będzie można wylistować wszystkich pracowników w firmie, wszystkie departamenty w firmie, wszystkich menedżerów, sprawdzić który departament ma najwięcej, a który najmniej, pracowników.
public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Adam", "Kowalski", EmployeeRole.ORDINARY_EMPLOYEE, 11);
        Employee employee2 = new Employee("Jan", "Nowak", EmployeeRole.ORDINARY_EMPLOYEE, 12);
        Employee employee3 = new Employee("Dariusz", "Mariusz", EmployeeRole.ORDINARY_EMPLOYEE, 13);
        Manager manager1 = new Manager("Boss", "One", EmployeeRole.MANAGER, 14);

        Employee employee4 = new Employee("Anna", "Maria", EmployeeRole.ORDINARY_EMPLOYEE, 21);
        Employee employee5 = new Employee("John", "Snow", EmployeeRole.ORDINARY_EMPLOYEE, 22);
        Manager manager2 = new Manager("Boss", "Two", EmployeeRole.MANAGER, 23);

        Manager president = new Manager("Adam", "Miłosz", EmployeeRole.CEO,1);
        Company company1 = new Company("Firma 1");
        Department department1 = new Department(11,manager1);
        Department department2 = new Department(22,manager2);
        Board board = new Board(1, president);

        company1.getDepartments().add(department1);
        company1.getDepartments().add(department2);
        company1.getDepartments().add(board);

        department1.getEmployees().add(employee1);
        department1.getEmployees().add(employee2);
        department1.getEmployees().add(employee3);
        department1.getEmployees().add(manager1);

        department2.getEmployees().add(employee4);
        department2.getEmployees().add(employee5);
        department2.getEmployees().add(manager2);

        board.getEmployees().add(president);

        company1.listAllEmployees();
        company1.listOfManagers();
        company1.getDepartmentWithLeastEmployee();
//        System.out.println(company1.getEmployees().stream().map(Object ::toString).collect(Collectors.joining()));



        System.out.println("#########################################################################");

        Employee employee10 = new Employee("Mariusz", "Pudzianowski", EmployeeRole.CEO,1);
        Employee employee11 = new Employee("Jan", "Maria", EmployeeRole.ORDINARY_EMPLOYEE,2);
        Company company2 = new Company("Firma 2");
        company2.addEmployee(employee10);
        company2.addEmployee(employee11);
        company2.companyList();
    }
}
