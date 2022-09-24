package com.sda.day1.EX2;

public class MainPerson {
    public static void main(String[] args) {
        Person person1 = new Person("Jan", "Kowalski", 25, "Male");
        Person person2 = new Person("Anna", "Kowalska", 70, "Female");
        Person person3 = new Person();
        person3.setFirstName("Jan");
        person3.setLastName("Kowalski");
        person3.setAge(25);
        person3.setGender("Male");
        System.out.println("person 1 equals person 2 = " + person1.equals(person2));
        System.out.println("person 1 equals person 3 = " + person1.equals(person3));
        System.out.println("person 2 equals person 3 = " + person2.equals(person3));
        System.out.println("person 1 hascode = " + person1.hashCode());
        System.out.println("person 2 hascode = " + person2.hashCode());
        System.out.println("person 3 hascode = " + person3.hashCode());
        System.out.println();
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person1.isRetired());
        System.out.println(person2.isRetired2());
    }

}
