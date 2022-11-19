package org.example.Reflection;

public class Person {
    private final String name;
    private Integer age;
    private final Boolean isMale;

    public Person(String name, Integer age, Boolean isMale) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }
    public Boolean amIOlder(Person person){
        return person.getAge() < age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Boolean getMale() {
        return isMale;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
