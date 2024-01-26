package vjezba2.primjer;

public interface ObservablePublisher {

    public void addObserver(ObserversSubscribers observer);
    public void removeObserver(ObserversSubscribers observer);
    public void notifyObservers();
}
