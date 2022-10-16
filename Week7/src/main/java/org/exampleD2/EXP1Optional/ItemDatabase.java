package org.exampleD2.EXP1Optional;

import java.util.*;

public class ItemDatabase {

    private Set<Item> items;

    public ItemDatabase(Set<Item> items) {
        this.items = items;


    }

    //Optional tutaj moze być null
    public Optional<Item> getItem(Integer id) {
        for (Item item : items) {
            if (item.getId().equals(id)) {
                return Optional.of(item); // gdy jestesmy pewni ze dany objekt nie jest nullem
//                return Optional.ofNullable(item); // kiedy objekt moze byc nullem
//                return item;
            }
        }
        return Optional.empty(); // kiedy mamy pewnosc ze objekt jest nullem
    }

    public static void example() {
        Set<Item> items = new HashSet<>();
        items.add(new Item(1, "Sugar", 10.0));
        items.add(new Item(2, "Salt", 5.0));
        items.add(new Item(3, "Pepper", 8.0));

        ItemDatabase db = new ItemDatabase(items);
        Optional<Item> optionalItem = db.getItem(2);

        if (optionalItem.isPresent()) {
            Item item = optionalItem.get();
            System.out.println(item.getName());
        }
        else {
            System.out.println("NOT FOUND");
        }

//        db.getItem(2).isPresent(item -> System.out.println(item.getName()));
    }


}


