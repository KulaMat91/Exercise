package org.exampleD2.EXP3Polimorfizm;

public class Smartphone implements NotificationHandlerInterface{


    @Override
    public void handleNotification(String notification) {
        System.out.println("Displaying notification on smartphone ");
        System.out.println(notification);
    }
}
