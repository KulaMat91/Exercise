package org.exampleD2.EXP3Polimorfizm;

public class Pager implements NotificationHandlerInterface{
    @Override
    public void handleNotification(String notification) {
        System.out.println("Displaying notification text on pager screen ");
        System.out.println(notification);
    }
}
