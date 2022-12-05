package org.example.ex32;

import java.io.*;
import java.nio.file.Path;
import java.util.List;

public class Task32 {

    public static void main(String[] args) {
        initData();

        Path dirPath = Path.of("src/main/java/org/example/ex32");
        Path inputFile = dirPath.resolve("course.txt");
        File file = inputFile.toFile();
//        System.out.println("Saving file...");
//        save(file);
        System.out.println("Opening file...");
        List<Car> loadedCars =load(file);
        System.out.println(loadedCars);
    }


    //serializacja
    private static void save(File file) {
        List<Car> cars = initData();
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(cars);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    //deserializacja
    private static List<Car> load(File file) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (List<Car>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    private static List<Car> initData() {
        return List.of(
                new Car("Volvo", 300_000, true),
                new Car("BMW", 50_000, false),
                new Car("Audi", 250_000, true)
        );
    }

}
