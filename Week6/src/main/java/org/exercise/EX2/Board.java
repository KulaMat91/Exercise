package org.exercise.EX2;

public class Board extends Department{
    public Board(Integer ID) {
        super(ID);
    }
    public Manager getPresident(){
        return this.manager;
    }
}
