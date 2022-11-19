package org.example.Multithreading;

public class ThreadingExample {
    //Thread - klasa
    //Runnable - interfejs
    //Dead lock - watki sobie nawzajem poblokują pracę

    public static void runExample() {
        Thread threadA = new Thread(() -> {
            for (int i = 0; i < 101; i++) {
                System.out.printf("Thread A: %d\n", i);
                try {
                    Thread.sleep(10); //metoda na zadaną milisekund czekać na wykonanie
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread threadB = new Thread(() -> {
            for (int i = 100; i >= 0; i--) {
                System.out.printf("Thread B: %d\n", i);
                try {
                    Thread.sleep(20); //metoda na zadaną milisekund czekać na wykonanie
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread threadC = new ThreadSubClass();
        Thread threadD = new Thread(new RunnableImplementation());

        threadA.start();
        threadB.start();
        threadC.start();
        threadD.start();
    }

    public static void runExample2() {
        Counter counter = new Counter();


        Thread threadA = new Thread(counter, "Thread A");
        Thread threadB = new Thread(counter, "Thread B");

        threadA.start();
        threadB.start();
    }

    public static void deadLockExample() {
        Thread threadA = new Thread(() -> {
            synchronized (IntegerData.x) {
                System.out.println(IntegerData.x);

                synchronized (IntegerData.y) {
                    System.out.println(IntegerData.y);
                }
            }
        });
        Thread threadB = new Thread(() -> {
            synchronized (IntegerData.y) {
                System.out.println(IntegerData.y);

                synchronized (IntegerData.x) {
                    System.out.println(IntegerData.x);
                }
            }
        });
        threadA.start();
        threadB.start();
    }
}
