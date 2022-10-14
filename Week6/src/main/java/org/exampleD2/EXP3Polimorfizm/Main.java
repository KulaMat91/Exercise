package org.exampleD2.EXP3Polimorfizm;

public class Main {
    public static void main(String[] args) {

        NotificationCenter center = new NotificationCenter();
        DesktopInternetBrowser browser = new DesktopInternetBrowser();

       Smartphone xiaomi = new Smartphone();
       Smartphone samsung = new Smartphone();
       Smartphone iphone = new Smartphone();

       Pager pager = new Pager();

       center.registerNotificationHandler(browser);
       center.registerNotificationHandler(xiaomi);
       center.registerNotificationHandler(samsung);
       center.registerNotificationHandler(iphone);
       center.registerNotificationHandler(pager);

       center.emitNotification("Hello World!");



    }

}
