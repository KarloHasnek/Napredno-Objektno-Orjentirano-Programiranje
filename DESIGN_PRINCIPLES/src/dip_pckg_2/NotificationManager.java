package dip_pckg_2;

import java.util.ArrayList;
import java.util.List;

public class NotificationManager {

    private final List<NotificationService> notificationServices;

    public NotificationManager() {
        notificationServices = new ArrayList<>();
    }

    public void addNotificationService(NotificationService notificationService) {
        if (notificationService == null) {
            throw new NullPointerException("NotificationService cannot be null!");
        } else if (notificationServices.contains(notificationService)) {
            throw new IllegalArgumentException("NotificationService already exists!");
        } else {
            notificationServices.add(notificationService);
            System.out.println("Service added successfully!");
        }
    }

    public void notifyAllWithMessage(String message, String recepient) {
        for (NotificationService notificationService : notificationServices) {
            notificationService.sendNotification(message, recepient);
        }
    }
}
