package org.Task7;
/*
Zadanie 7
Utwórz klasę
Employee z polami id, name oraz salary . Utwórz niezbędne metody i
konstruktor. Utwórz 3 instancje klasy Employee i dodaj je do listy. Korzystając ze
strumieni, znajdź pierwszego pracownika, który nie jest null i ma pensję co najmniej
30000. Jeśli nie zostanie znaleziony, rzuć wyjątek.
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Task7 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Mariusz",1 , 40000);
        Employee employee2 = new Employee("Dariusz", 2, 30000);
        Employee employee3 = new Employee("Pudzian", 3 , 5000);

        List<Employee> listOfEmployee = new ArrayList<>();
        listOfEmployee.add(employee1);
        listOfEmployee.add(employee2);
        listOfEmployee.add(employee3);

        System.out.println("TASK 7:");
        System.out.println(Task7.getEmployee30000Salary(listOfEmployee));
        System.out.println();

        System.out.println("TASK 8:");
        List<Employee> sortedList = Task7.sortedEmployee(listOfEmployee);
        for (Employee employee : sortedList){
            System.out.println(employee);
        }
        System.out.println();

        System.out.println("TASK 9:");
        System.out.println(Task7.maxSalary(listOfEmployee));


    }

    public static Optional<Employee> getEmployee30000Salary(List<Employee> listOfEmployee){
        return  listOfEmployee.stream().filter(employee -> employee.getSalary() >= 30000).findFirst();

    }

/*
Zadanie 8
Na podstawie listy pracowników z poprzedniego ćwiczenia za pomocą strumieni utwórz
nową listę z pracownikami posortowanymi według nazwisk.
 */

    public static List<Employee> sortedEmployee(List<Employee> employeeList){
        return employeeList.stream().sorted(Comparator.comparing(Employee::getName)).toList();
    }

/*
Zadanie 9
Na podstawie listy pracowników z ćwiczenia 7, za pomocą strumieni zwróć liczbę
reprezentującą maksymalne wynagrodzenie wszystkich pracowników.
 */
    public static Integer maxSalary(List<Employee> employeeList){
        return employeeList.stream().max(Comparator.comparing(Employee::getSalary)).get().getSalary();
    }

}
