package org.example.Annotations;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        ExampleClass.testAnnotation(ExampleClass.class);
        System.out.println("////////////////////////////////////////////////////////////");
        ExampleClass.getMySingleValueAnnotationFromMethod(ExampleClass.class.getMethod("markedDefaultValueAnnotation"));
        ExampleClass.getMySingleValueAnnotationFromMethod(ExampleClass.class.getMethod("markedSingleValueMethode"));
        ExampleClass.getMySingleValueAnnotationFromMethod(ExampleClass.class.getMethod("markedMultiValueMethod"));
        //podaje nazwę metody z klasy ExampleClass
    }
}
