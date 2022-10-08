package org.example.EXP2;

import java.util.List;

public class FamilyMember {
    public String name;

    /*
        One to Many relationship
     */
    public List<FamilyMember> children;

    /*
        Many to One relationship
     */
    public FamilyMember mother;

    /*
        Many to One relationship
     */
    public FamilyMember father;

    /*
        Many to Many relationship
     */
    public List<FamilyMember> siblings;

    /*
        One to One relationship
     */
    public FamilyMember spouse;

    public FamilyMember(String name){
        this.name = name;
    }
}
