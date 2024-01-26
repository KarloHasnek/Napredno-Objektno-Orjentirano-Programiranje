package vjezba2.zadatak3.weather_station.model;

public class WeatherStation extends WeatherStationObservable{

    private int id;
    private static int cntID = 10;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherStation() {
        this.id = cntID++;
        this.temperature = 0.0f;
        this.humidity = 0.0f;
        this.pressure = 0.0f;
    }

    @Override
    protected void addObserver(Observer observer) {
        System.out.println("Adding observer: " + observer);
        observers.add(observer);
    }

    @Override
    protected void removeObserver(Observer observer) {
        if (observers.contains(observer)) {
            System.out.println("removing observer: " + observer);
            observers.remove(observer);
        }
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public void setSensorStateChanged(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;

        System.out.println("Sensor state changed!");
        notifyObservers();
    }

    @Override
    public void notifyObservers() {

        for(Observer observer : observers) {
            System.out.println("---------------------------------------------");
            System.out.println("Notifying observer: " + observer);
            observer.update(temperature, humidity, pressure);
        }
        System.out.println("---------------------------------------------");
    }
}
