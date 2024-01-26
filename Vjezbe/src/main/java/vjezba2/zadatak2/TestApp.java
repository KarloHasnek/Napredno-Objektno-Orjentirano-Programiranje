package vjezba2.zadatak2;

public class TestApp {

    public static void main(String[] args) {

        AutoMoto autoMoto = new AutoMoto();
        BugMagazine bugMagazine = new BugMagazine();

        Subscriber subscriber1 = new Subscriber("subscriber1");
        Subscriber subscriber2 = new Subscriber("subscriber2");

        autoMoto.register(subscriber1);
        autoMoto.register(subscriber2);

        bugMagazine.register(subscriber1);
        bugMagazine.register(subscriber2);

        autoMoto.notifyObservers();
        bugMagazine.notifyObservers();

        autoMoto.unregister(subscriber1);
        autoMoto.notifyObservers();

        bugMagazine.unregister(subscriber2);
        bugMagazine.notifyObservers();
    }
}
