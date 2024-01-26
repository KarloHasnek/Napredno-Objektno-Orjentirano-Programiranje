package vjezba2.zadatak3.weather_station.model;

import java.util.ArrayList;

public abstract class WeatherStationObservable implements Observable{

    protected ArrayList<Observer> observers;

    protected WeatherStationObservable() {
        observers = new ArrayList<>();
    }

    protected abstract void addObserver(Observer observer);
    protected abstract void removeObserver(Observer observer);

}
