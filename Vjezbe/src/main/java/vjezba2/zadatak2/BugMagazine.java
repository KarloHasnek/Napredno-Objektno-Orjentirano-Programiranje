package vjezba2.zadatak2;

import java.util.ArrayList;
import java.util.List;

public class BugMagazine implements Observable{

    private List<Observer> observers;

    public BugMagazine() {
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.removeIf(o -> o.equals(observer));
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(getClass().getSimpleName());
        }
    }
}
