package vjezba2.zadatak4;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class SourceProject implements Observable{

    private final List<Observer> observers = new ArrayList<>();
    private String code;
    private LocalTime lastPush;
    private String nameOfLastPusher;

    public String getCode() {
        return code;
    }

    public void setCode(String code, Observer observer) {
        this.code = code;
        this.lastPush = LocalTime.now();
        this.nameOfLastPusher = observer.getName();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.removeIf(o -> o.equals(observer));
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(code, lastPush, nameOfLastPusher);
        }
    }
}
