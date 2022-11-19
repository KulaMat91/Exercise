package org.example.Multithreading;

public class ThreadingExample {
    //Thread - klasa
    //Runnable - interfejs

    public static void runExample() {
        Thread threadA = new Thread(() -> {
            for (int i = 0; i < 101; i++) {
                System.out.printf("Thread A: %d\n", i);
                try {
                    Thread.sleep(100); //metoda na zadaną milisekund czekać na wykonanie
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread threadB = new Thread(() -> {
            for (int i = 100; i >= 0; i--) {
                System.out.printf("Thread B: %d\n", i);
                try {
                    Thread.sleep(200); //metoda na zadaną milisekund czekać na wykonanie
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        threadA.start();
        threadB.start();
    }
}
