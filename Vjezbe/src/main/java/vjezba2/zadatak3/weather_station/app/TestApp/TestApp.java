package vjezba2.zadatak3.weather_station.app.TestApp;

import vjezba2.zadatak3.weather_station.model.NewMobileApp;
import vjezba2.zadatak3.weather_station.model.WeatherStation;

public class TestApp {

    public static void main(String[] args) {

        WeatherStation weatherStationObservable = new WeatherStation();
        NewMobileApp newMobileApp = new NewMobileApp();
        NewMobileApp newMobileApp2 = new NewMobileApp();
        newMobileApp2.registerToWeatherService(weatherStationObservable);
        newMobileApp.registerToWeatherService(weatherStationObservable);
        weatherStationObservable.setSensorStateChanged(22, 63, 1002);
    }
}
