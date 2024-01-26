package vjezba2.primjer;

public class ConcreteSubscriber1 implements ObserversSubscribers{

    private ObservablePublisher observablePublisher;

    @Override
    public void update() {
        System.out.println("ConcreteSubscriber1 update() called.");
    }

    public void setObservablePublisher(ObservablePublisher observablePublisher) {
        this.observablePublisher = observablePublisher;
    }
}
