package org.example.EXP2;

import java.util.List;

public class Family {
    /*
         One to One relationship
     */
    public FamilyMember headOfFamily;

    /*
        One to Many relationship
    */
    public List<FamilyMember> members;

    public String surname;

    public Family(String surname) {
        this.surname = surname;
    }
}
