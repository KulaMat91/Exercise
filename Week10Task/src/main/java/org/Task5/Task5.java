package org.Task5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
Zadanie 5
Mając listę stringów, napisz metodę, która zwraca listę wszystkich ciągów zaczynających
się na literę „a” (małe litery) i zawierających dokładnie 3 litery, użyj strumieni.
 */
public class Task5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ania");
        list.add("ana");
        list.add("ananas");
        list.add("car");
        list.add("asa");

        List<String> newList = Task5.newList(list);
        for (String string : newList) {
            System.out.println(string);
        }


    }

    public static List<String> newList(List<String> list) {
//        return list.stream().
//                filter(s -> s.length() == 3 && s.startsWith("a")).collect(Collectors.toList());
        return list.stream().
                filter(s -> s.length() == 3).
                filter(s -> s.startsWith("a")).collect(Collectors.toList());

    }

}
