package org.exampleD2.EXP3Polimorfizm;

public class DesktopInternetBrowser implements NotificationHandlerInterface{


    @Override
    public void handleNotification(String notification) {
        System.out.println("Displaying notification on desktop browser ");
        System.out.println(notification);
    }
}
