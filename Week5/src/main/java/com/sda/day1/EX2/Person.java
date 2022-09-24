package com.sda.day1.EX2;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;

    public Person() {
    }

    public Person(String firstName, String lastName, int age, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String toString() {
        return "First Name: " + firstName +
                "\nLast Name: " + lastName +
                "\n Age: " + age +
                "\n Gender: " + gender;
    }
}
