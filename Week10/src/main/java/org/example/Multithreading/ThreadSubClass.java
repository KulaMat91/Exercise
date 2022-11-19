package org.example.Multithreading;

public class ThreadSubClass extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello Thread!");

        }
    }
}
