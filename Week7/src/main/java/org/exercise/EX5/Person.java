package org.exercise.EX5;

public abstract class Person {
    private Integer id;
    private String name;
    private String surname;
    private Integer yearOfBirth;

    public Person(Integer id, String name, String surname, Integer yearOfBirth) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getYearOfBirth() {
        return yearOfBirth;
    }
}
