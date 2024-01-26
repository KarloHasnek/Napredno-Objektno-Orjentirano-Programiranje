package vjezba2.zadatak3.weather_station.model;

public class NewMobileApp implements WeatherStationRegistration, Display {

    private float temperature;
    private float humidity;
    private float pressure;

    public NewMobileApp() {

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
        display();
    }

    @Override
    public void registerToWeatherService(WeatherStationObservable wso) {
        wso.addObserver(this);
    }

    @Override
    public void unregisterFromWeatherService(WeatherStationObservable wso) {
        wso.removeObserver(this);
    }
}
