package org.example.Reflection;

import java.util.ArrayList;
// W sklonowanym repozytorium  SDAJavaAdvanced  - to samo
public class Main {
    public static void main(String[] args) {
        ReflectionTest.displayClassName(10);
        ReflectionTest.listClassFields(Integer.class);
        ReflectionTest.listClassMethods(Integer.class);

        ReflectionTest.displayClassName("Hello world");
        ReflectionTest.listClassFields(String.class);
        ReflectionTest.listClassMethods(String.class);

        ReflectionTest.displayClassName(new ArrayList<String >());// za pomocą refreksji nie można uzyskrać rodzaju typu generycznego - Type Erasure
        ReflectionTest.listClassFields(ArrayList.class);
        ReflectionTest.listClassMethods(ArrayList.class);

        ReflectionTest.displayClassName(new Integer[0]);
        ReflectionTest.listClassFields(Integer[].class);
        ReflectionTest.listClassMethods(Integer[].class);

        ReflectionTest.displayClassName(new Person("XYZ",10,true));
        ReflectionTest.listClassFields(Person.class);
        ReflectionTest.listClassMethods(Person.class);
    }
}
