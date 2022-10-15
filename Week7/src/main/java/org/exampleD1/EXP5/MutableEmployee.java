package org.exampleD1.EXP5;

public class MutableEmployee {
    private  Integer id;
    private String firstName;
    private String secondName;
    private String role;

    public MutableEmployee(Integer id, String firstName, String secondName, String role) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.role = role;
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getRole() {
        return role;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
