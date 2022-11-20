package org.Task6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
Zadanie 6
Napisz metodę, która zwraca łańcuch rozdzielany przecinkami na podstawie podanej
listy liczb całkowitych. Każdy element powinien być poprzedzony literą „e”, jeśli liczba
jest parzysta, i poprzedzona literą „o”, jeśli liczba jest nieparzysta. Na przykład, jeśli lista
danych wejściowych to (3,44), wynikiem powinno być „o3, e44”. Użyj strumieni.
 */
public class Task6 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(8);
        list.add(32);
        list.add(11);
        System.out.println(Task6.task5(list));
        System.out.println(Task6.oddEvenConv(list));
    }

    public static String task5(List<Integer> integers) {
        return integers.stream().map(a -> a % 2 == 0 ? "e" + a : "o" + a).collect(Collectors.joining(","));
    }

    public static List<String> oddEvenConv(List<Integer> integerList) {

        List<String> oeConverted = new ArrayList<>();
        integerList.stream().map(Object::toString)
                .toList().forEach(a -> oeConverted.add(Integer.parseInt(a) % 2 == 0 ? String.format("e%s", a) : String.format("o%s", a)));
        return oeConverted;
    }
}
