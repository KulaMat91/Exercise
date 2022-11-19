package org.example.Annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MySingleValueAnnotation {
    // annotacja może zawierac tylko typy prymitywne
    int value() default  -1 ; //default - wartosc domyślna
}
