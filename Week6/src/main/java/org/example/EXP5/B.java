package org.example.EXP5;

public class B extends  A{
    public void doSomething(A object){
        System.out.println(object.publicField);
        System.out.println(this.protectedField);
        System.out.println(object.protectedField);
        System.out.println(object.defaultField);
//        System.out.println(object.privateField);
    }
}
