package vjezba2.zadatak3.weather_station.model;

public class MobileWeatherAppObserver implements Observer, Display {

    private float temperature;
    private float humidity;
    private float pressure;
    private int cnt;
    private WeatherStationObservable weatherStationObservable;

    public MobileWeatherAppObserver(WeatherStationObservable weatherStationObservable) {
        this.weatherStationObservable = weatherStationObservable;
        weatherStationObservable.addObserver(this);
        cnt = 1;
    }

    @Override
    public void display() {
        System.out.println("Temperature: " + temperature + "C\n"
                + "Humidity: " + humidity + "%\n"
                + "Pressure: " + pressure + "Hpa\n");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        System.out.println("Weather parameters updated!");
        if (cnt % 100 == 0) {
            try {
                display();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Some method triggered...");
        weatherStationObservable.notifyObservers();
    }
}
