package com.sda.day1.EX4;
//Napisz Enum Department.
//Dodaj ponizsze instancje do eunumu:
//- HR
//- BRANDING
//- SALES
//- MARKETING
//- ADMINISTRATION
//- HEAD
//- IT
//dodaj pole "departmentId" typu int oraz konstruktor przyjmujacy departmentId jako parametr.

public enum EnumDepartment {
    HR(1),
    BRANDING(2),
    SALES(3),
    MARKETING(4),
    ADMINISTRATION(5),
    HEAD(6),
    IT(7);

    private final int departmentId;

    EnumDepartment(int departmentId){
        this.departmentId = departmentId;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    //Jak jest final nie mozna settera
//    public void setDepartmentId(int departmentId){
//        this.departmentId = departmentId;
//    }
}
