package com.sda.day1.EX5;

public enum Department {
    HR(1),
    BRANDING(2),
    SALES(3),
    MARKETING(4),
    ADMINISTRATION(5),
    HEAD(6),
    IT(7);

    private final int departmentId;

    Department(int departmentId){
        this.departmentId = departmentId;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    @Override
    public String toString() {
        return "Department {" +
                "departmentId = " + departmentId +
                '}';
    }
}
