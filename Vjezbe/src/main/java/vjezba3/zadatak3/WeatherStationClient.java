package vjezba3.zadatak3;

public class WeatherStationClient {

    private static PrimaryInterface objMes;

    public static void main(String[] args) {

        objMes = new MetricWeatherServiceStation();
        objMes.readTempC();
        objMes.readWndSpdms();
        objMes.showWthrData();
        objMes = new Adapter(new NonMetricWeatherServiceAdaptee());
        objMes.readTempC();
        objMes.readWndSpdms();
        objMes.showWthrData();


    }
}
