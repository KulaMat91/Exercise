package org.Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

/*
Napisz metodę, która zwraca średnią z listy liczb całkowitych za pomocą strumieni.
 */
public class Task3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);

        System.out.println(Task3.average(list));

    }

    public static OptionalDouble average(List<Integer> list) {
        return list.stream().mapToDouble(a -> a).average();
    }
}
