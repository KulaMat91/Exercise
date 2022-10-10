package org.exercise.EX2;

public class Board extends Department {
    public Board(Integer ID, Manager manager) {
        super(ID,manager);
    }

    public Manager getPresident() {
        return this.manager;
    }

    @Override
    public String nameDepartment(){
        return "Board " + getID();
    }
    @Override
    public String toString() {
        return "Board {" +
                "ID = " + getID() +
                ", employees = " + employees +
                '}';
    }
}
