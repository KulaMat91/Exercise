package org.Task4;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

/*
Napisz metodę, która konwertuje wszystkie ciągi z listy na wielkie litery za pomocą
strumieni.
 */
public class Task4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ford");
        list.add("skoda");
        list.add("opel");
        list.add("mercedes");

        List<String> upperList=Task4.listToUpperCase(list);

        for (String string : list) {
            System.out.println(string);
        }
        System.out.println();
        for (String string : upperList) {
            System.out.println(string);
        }
    }

    public static List<String> listToUpperCase(List<String> list) {
        return list.stream().map(String::toUpperCase).toList();
    }
}
