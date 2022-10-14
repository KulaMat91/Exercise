package org.exampleD2.EXP3Polimorfizm;

import java.util.ArrayList;
import java.util.List;

public class NotificationCenter {
    private List<NotificationHandlerInterface> notificationHandlers = new ArrayList<>();

    public void registerNotificationHandler(NotificationHandlerInterface handler){
        notificationHandlers.add(handler);
    }

    public void  emitNotification(String notification) {
        for (NotificationHandlerInterface handler: notificationHandlers){
            handler.handleNotification(notification);
        }
    }
}
