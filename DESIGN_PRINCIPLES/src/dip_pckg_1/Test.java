package dip_pckg_1;

public class Test {

    public static void main(String[] args) {

        EmailSender emailSender = new EmailSender();
        NotificationService notificationService = new NotificationService(emailSender);

        notificationService.sendNotification("Hello", "User_01");

        NotificationManager notificationManager = new NotificationManager();
        notificationManager.addNotificationService(notificationService);
        notificationManager.addNotificationService(new NotificationService(new EmailSender()));

        notificationManager.notifyWithMessage("Hello 2", "User_02");
    }
}
