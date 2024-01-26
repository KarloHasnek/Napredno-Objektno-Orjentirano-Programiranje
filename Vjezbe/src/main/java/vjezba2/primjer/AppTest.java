package vjezba2.primjer;

public class AppTest {

    public static void main(String[] args) {

        ConcreteNewspaper concreteNewspaper = new ConcreteNewspaper();

        ConcreteSubscriber1 concreteSubscriber1 = new ConcreteSubscriber1();
        concreteNewspaper.addObserver(concreteSubscriber1);
        concreteSubscriber1.setObservablePublisher(concreteNewspaper);

        concreteNewspaper.notifyObservers();
    }
}
