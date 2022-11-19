package org.example.Annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyMultiValueAnnotation {
    String name();
    String classNAme();

}
