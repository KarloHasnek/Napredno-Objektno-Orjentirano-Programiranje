package dip_pckg_2;

public class Test {

    private static NotificationService newNotificationService;

    public static void main(String[] args) {

        NotificationService notificationService = new NotificationService(new EmailSender());
        NotificationService notificationService2 = new NotificationService(new SmsSender());
        NotificationService notificationService3 = new NotificationService(new WhatsAppSender());

        NotificationManager notificationManager = new NotificationManager();
        notificationManager.addNotificationService(notificationService);
        notificationManager.addNotificationService(notificationService2);
        notificationManager.addNotificationService(notificationService3);

        notificationManager.addNotificationService(newNotificationService);

        notificationManager.notifyAllWithMessage("Hello", "User_01");
    }
}
