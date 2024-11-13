package pckg_meteo_1;

public class AppTest {

    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation(9, 78, 1015);
        PhoneObserverWeatherApp phoneApp1 = new PhoneObserverWeatherApp();
        PhoneObserverWeatherApp phoneApp2 = new PhoneObserverWeatherApp();
        phoneApp1.register(weatherStation);
        phoneApp2.register(weatherStation);
        weatherStation.setStateData(10, 79, 1016);

    }
}
