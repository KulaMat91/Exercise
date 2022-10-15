package org.exampleD1.EXP6;
//nestesInner
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(1,"Mariusz", "Nowak", 1990,1000,"CEO","Board");
        System.out.println(employee.getIdentity().getFirstName());
//        Employee.Identity identity = new Employee.Identity(1,"X","Y", 1998);

    }
}
