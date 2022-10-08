package org.example.EXP5;

public class A {
    public String publicField;
    protected String protectedField;
    String defaultField;
    private String privateField;

    public void doSomething(A object){
        System.out.println(object.publicField);
        System.out.println(this.protectedField);
        System.out.println(object.protectedField);
        System.out.println(object.defaultField);
        System.out.println(object.privateField);
    }
}
