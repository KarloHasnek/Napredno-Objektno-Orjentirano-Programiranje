package dip_pckg_2;

public class EmailSender implements SenderService{

    @Override
    public void sendMessage(String message, String recepient) {
        System.out.println(this.getClass().getSimpleName() + " sent to: " + recepient + "\nmessage: " + message);
    }
}
