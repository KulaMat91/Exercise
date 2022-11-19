package org.example.Reflection.Task1;

import java.lang.reflect.*;

public class StudentReflection {
    public static void displayFields(Class<?> clazz) {
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.printf("%s %s%n", field.getName(), field.getType().getSimpleName());
        }
        System.out.println();
    }

    public static void displayMethods(Class<?> clazz) {
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.printf("%s Returns: %s Parameters: ", method.getName(), method.getReturnType().getSimpleName());
            for (Parameter parameter : method.getParameters()) {
                System.out.printf("%s ", parameter.getType().getSimpleName());
            }
        }
        System.out.println();
    }

    public static void displayConstructor(Class<?> clazz) {
        Constructor<?>[] constructors = clazz.getConstructors();
        for (Constructor<?> ctor : constructors) {
            for (Parameter parameter : ctor.getParameters()) {
                System.out.printf("%s ", parameter.getType().getSimpleName());
            }
            System.out.println();
        }
    }

    public static Object createObject(Class<?> clazz, Object[] params) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<?>[] ctors = clazz.getConstructors();

        Object object = null;

        for (Constructor<?> ctor: ctors){
            Parameter[] ctorParams = ctor.getParameters();
            if (ctorParams.length != params.length)
                continue;

            Boolean parametersValid = true;

            for (Integer i = 0; i < params.length;i++){
                Class<?> ctorParamType = ctorParams[i].getType();
                Class<?> paramType = params[i].getClass();

                if (!paramType.equals((ctorParamType))){
                    parametersValid = false;
                    break;
                }
            }
            if (!parametersValid)
                continue;
            object = ctor.newInstance(params);
            break;
        }
        return object;

    }

//    public static Object getPrivateField(Object object, String fieldName){
//
//    }

    public static void setPrivateField(Object object, String fieldName, Object newValue) throws NoSuchFieldException, IllegalAccessException {
        Field field = object.getClass().getDeclaredField(fieldName);
        field.setAccessible(true);
        if (field.getType().equals(newValue.getClass())){
            field.set(object,newValue);
        }
    }

//    public static Object invokeMethod(Object object , String methodName, Object parameters){
//
//    }

}
