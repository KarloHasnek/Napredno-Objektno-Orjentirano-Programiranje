package dip_pckg_2;

public class NotificationService {

    private SenderService senderService; // loose coupling

    public NotificationService(SenderService senderService) {
        this.senderService = senderService;
    }

    public void sendNotification(String message, String recepient) {
        senderService.sendMessage(message, recepient);
    }
}
