package org.example.ex1;

import java.util.Comparator;

public class MyOwnComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}
