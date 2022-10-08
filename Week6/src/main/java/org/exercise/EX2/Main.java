package org.exercise.EX2;

//Zadanie 2: Firma
//Stwórz hierarchię klas reprezentującą hierarchię w dużej firmie.
// Firma ma departamenty, a każdy departament ma menedżera i pracowników (menedżer też jest pracownikiem).
// Firma ma jeden specjalny departament - zarząd - który zarządza wszystkimi jej departamentami, a jej menedżer to prezes firmy.
// Zaimplementuj metody, za pomocą których będzie można wylistować wszystkich pracowników w firmie, wszystkie departamenty w firmie, wszystkich menedżerów, sprawdzić który departament ma najwięcej, a który najmniej, pracowników.
public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Adam", "Kowalski", EmployeeRole.MANAGER);
        Employee employee2 = new Employee("Jan", "Nowak", EmployeeRole.ORDINARY_EMPLOYEE);
        Company company1 = new Company("Firma 1");

        company1.addEmployee(employee1);
        company1.addEmployee(employee2);
        company1.companyList();

        System.out.println();

        Employee employee10 = new Employee("Mariusz", "Pudzianowski", EmployeeRole.CEO);
        Employee employee11 = new Employee("Jan", "Maria", EmployeeRole.ORDINARY_EMPLOYEE);
        Company company2 = new Company("Firma 2");
        company2.addEmployee(employee10);
        company2.addEmployee(employee11);
        company2.companyList();
    }
}
