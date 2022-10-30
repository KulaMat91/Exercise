package org.example.EX1;

import java.util.List;

public class Servers {
    private static Servers instance;
    private List<Servers> serversList;

    public static Servers getInstance() {
        if (instance == null) {
            instance = new Servers();
        }
        return instance;
    }
}
