package pckg_meteo_1;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observable {

    private float temperature;
    private float humidity;
    private float pressure;
    private final List<Observer> observers;

    public WeatherStation(float t, float h, float p){
        this.temperature = t;
        this.humidity = h;
        this.pressure = p;
        this.observers = new ArrayList<>();
    }


    @Override
    public void add(Observer observer) {
        if(!observers.contains(observer)){
            observers.add(observer);
            System.out.println("Observer" + observer + "added.");
        } else {
            System.out.println("Observer" + observer + "already in the list!");
        }
    }

    @Override
    public void remove(Observer observer) {
        if (observers.contains(observer)){
            observers.remove(observer);
            System.out.println("Observer" + observer + "removed.");
        } else {
            System.out.println("Observer" + observer + "not in the list!");
        }
    }

    @Override
    public void notifyAllObservers() {
        if (!observers.isEmpty()) {
            for (Observer observer : observers){
                observer.update(this.temperature, this.humidity, this.pressure);
            }
        } else {
            System.out.println("No observers to notify!");
        }
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setStateData(float t, float h, float p){
        this.temperature = t;
        this.humidity = h;
        this.pressure = p;
        notifyAllObservers();
    }
}
