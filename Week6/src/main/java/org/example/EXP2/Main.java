package org.example.EXP2;

public class Main {
    public static void main(String[] args) {
        Family royalFamily = new Family("Windsor");
        FamilyMember elizabeth = new FamilyMember("Elizabeth");
        FamilyMember charles = new FamilyMember("Charles");
        FamilyMember camilla = new FamilyMember("Camilla");
        FamilyMember harry = new FamilyMember("Harry");
        FamilyMember william = new FamilyMember("William");

        royalFamily.headOfFamily = elizabeth;
        royalFamily.members.add(elizabeth);
        royalFamily.members.add(charles);
        royalFamily.members.add(camilla);
        royalFamily.members.add(harry);
        royalFamily.members.add(william);

        elizabeth.children.add(charles);
        charles.children.add(harry);
        charles.spouse = camilla;
        camilla.spouse = charles;
        charles.mother = elizabeth;
        harry.father = charles;
        william.father = charles;
        harry.siblings.add(william);
        william.siblings.add(harry);

        // Association - all relations between objects
        // Aggregation - one to many, many to one, many to many (multiple objects aggregated to one collection); example: children, siblings
        // Composition - indirect relations through other objects; example: grandparents, aunts, uncles, cousins
    }
}
