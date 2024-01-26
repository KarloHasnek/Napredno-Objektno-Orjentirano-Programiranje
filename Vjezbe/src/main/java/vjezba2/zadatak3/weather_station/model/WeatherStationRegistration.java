package vjezba2.zadatak3.weather_station.model;

public interface WeatherStationRegistration extends Observer{

    void registerToWeatherService(WeatherStationObservable wso);
    void unregisterFromWeatherService(WeatherStationObservable wso);

}
