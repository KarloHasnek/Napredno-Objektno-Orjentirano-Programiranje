package vjezba2.primjer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteNewspaper implements ObservablePublisher{

    private List<ObserversSubscribers> observers;

    public ConcreteNewspaper() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(ObserversSubscribers observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(ObserversSubscribers observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(ObserversSubscribers observer : observers) {
            observer.update();
        }
    }
}
