package org.example.Annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class ExampleClass {
    @MyMarkerAnnotation
    public void markedMethod() {
    }

    @MySingleValueAnnotation
    public Integer markedDefaultValueAnnotation() {
        return 44;
    }

    @MySingleValueAnnotation(value = 50)
    public String markedSingleValueMethode() {
        return "Hello World";

    }

    @MyMultiValueAnnotation(name = "markedMultiValueMethod", classNAme = "Double")
    public Double markedMultiValueMethod() {
        return 0.0;
    }

    public static void testAnnotation(Class<?> clazz) {
        for (Method method : clazz.getDeclaredMethods()) {
            System.out.printf("Method %s\n", method.getName());
            for (Annotation annotation : method.getDeclaredAnnotations()) {
                System.out.printf("Annotation : %s\n", annotation.annotationType().getSimpleName());

            }
        }
    }

    public static void getMySingleValueAnnotationFromMethod(Method method) {
        MySingleValueAnnotation annotation = method.getAnnotation(MySingleValueAnnotation.class);
        if (annotation == null) {
            System.out.printf("Method %s does not have the MySingleValueAnnotation!\n", method.getName());
        }
        else {
            System.out.printf("MySingleValueAnnotation value for method %s is %d\n", method.getName(), annotation.value());
        }
    }
}
