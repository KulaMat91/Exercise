package org.example.Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ReflectionTest {
    public static void displayClassName(Object object){
        // getClass
        //klasa reprezentująca nieznanty typ generyczny
        Class<?> clazz = object.getClass();
        System.out.println(clazz.getSimpleName());
    }

    public static void listClassFields(Class<?> clazz){
//        Class<?> clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields(); // getDeclaredFieldsdostep do wszystkich fieldów prywatnych
        // getFields dostep do wszystkich fieldów publicznych
        for (Field field: fields){
            System.out.printf("%s %s%n",field.getName(),field.getType().getSimpleName());
        }
        System.out.println();
    }
    public static void listClassMethods(Class<?> clazz){
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method: methods){
            System.out.printf("%s Returns: %s Parameters: ",method.getName(),method.getReturnType().getSimpleName());
            for (Parameter parameter : method.getParameters()){
                System.out.printf("%s ",  parameter.getType().getSimpleName());
            }
        }
        System.out.println();
    }
}
