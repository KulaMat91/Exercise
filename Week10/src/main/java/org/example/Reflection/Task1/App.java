package org.example.Reflection.Task1;

import java.lang.reflect.InvocationTargetException;

public class App {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        StudentReflection.displayFields(Student.class);
        StudentReflection.displayMethods(Student.class);
        StudentReflection.displayConstructor(Student.class);

        Object studentObject = StudentReflection.createObject(Student.class, new Object[]{"Mat","X",18,"indxNr"});
        Student student = (Student) studentObject;


        StudentReflection.setPrivateField(student,"indxNr","999");
    }
}
