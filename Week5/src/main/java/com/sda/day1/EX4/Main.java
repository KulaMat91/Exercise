package com.sda.day1.EX4;

public class Main {
    public static void main(String[] args) {
        System.out.println(UserRole.ADMIN);
        EnumDepartment[] values = EnumDepartment.values();
        for (EnumDepartment department : values){
            System.out.println(department);
        }

    }
}
