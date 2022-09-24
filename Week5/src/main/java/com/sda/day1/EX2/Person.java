package com.sda.day1.EX2;

import java.util.Objects;

public class Person {

    //FIELDS - pola
    private String firstName;
    private String lastName;
    private int age;
    private String gender;

    //CONSTRUCTOR
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

    public String fullName() {
        return "Full name: " + firstName + " " + lastName;
    }

    public boolean isRetired() {
        if (gender.equals("Male") && age > 67) {
            return true;
        } else if (gender.equals("Female") && age > 65) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isRetired2() {
        if ("MALE".equalsIgnoreCase(gender)) {
            return age > 67;
        } else if ("FEMALE".equalsIgnoreCase(gender)) {
            return age > 65;//jezeli jest wieksze to true
        }
        return false;
    }

    //zmieniamy zachowanie toStringa z defaltowej klasy Object
    //@SuppressWarnings("all") - anotacja zeby nie świecił warning, ktorego chcemy, w środku wpisuje warning lub all zeby wszystkie
    @Override // annotacja nadpisujaca istniejącą metodę
    public String toString() {
        return "[First Name: " + firstName +
                ". Last Name: " + lastName +
                ". Age: " + age +
                ". Gender: " + gender + "]";
    }


    //Dodaj metody .equals() and .hashcode() alt +insert
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age
                && Objects.equals(firstName, person.firstName)
                && Objects.equals(lastName, person.lastName)
                && Objects.equals(gender, person.gender);// porownywać najlepiej wszyskie pola z obiektu
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, gender);
    }
}
