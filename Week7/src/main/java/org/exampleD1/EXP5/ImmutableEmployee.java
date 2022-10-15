package org.exampleD1.EXP5;

public class ImmutableEmployee {
    private final Integer id;
    private final String firstName;
    private final String secondName;
    private final String role;
    private final ImmutableEmployee[] teammates;


    public ImmutableEmployee(Integer id, String firstName, String secondName, String role, ImmutableEmployee[] teammates) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.role = role;
        this.teammates = teammates;
    }
// kopiowanie wartosci aby nie mozna ich było podmienić w arrayu
    public ImmutableEmployee[] getTeammates() {
        ImmutableEmployee[] copy = teammates.clone();
        return teammates.clone();
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


}
