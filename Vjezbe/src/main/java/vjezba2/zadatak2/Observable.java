package vjezba2.zadatak2;

public interface Observable {

    void register(Observer observer);
    void unregister(Observer observer);
    void notifyObservers();
}
