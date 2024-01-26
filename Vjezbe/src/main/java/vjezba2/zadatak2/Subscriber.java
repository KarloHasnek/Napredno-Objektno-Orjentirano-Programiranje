package vjezba2.zadatak2;

public class Subscriber implements Observer{

    private String username;

    public Subscriber(String username) {
        this.username = username;
    }

    @Override
    public void update(String magazine) {
        System.out.println("Magazine " + magazine + " arrived for " + username);
    }
}
