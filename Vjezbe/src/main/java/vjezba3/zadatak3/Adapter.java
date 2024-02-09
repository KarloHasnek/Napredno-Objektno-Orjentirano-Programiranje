package vjezba3.zadatak3;


public class Adapter implements PrimaryInterface {

    private NonMetricWeatherServiceAdaptee weatherService;
    private double temp;
    private double spd;

    public Adapter(NonMetricWeatherServiceAdaptee adapteeWthrServ) {
        this.weatherService = adapteeWthrServ;
    }

    @Override
    public void readTempC() {
        weatherService.readTempInF();
        this.temp = convertFintoC(weatherService.getTempF());
    }

    @Override
    public void readWndSpdms() {
        weatherService.readWndSpdInKn();
        this.spd = convertKnintoMs(weatherService.getWndSpdKn());

    }

    @Override
    public void showWthrData() {
        System.out.println("\n");
        System.out.println("******************* Weather data *********************");
        System.out.println("Input data from " + weatherService.getClass().getSimpleName() + ":");
        weatherService.showMeasuredData();
        System.out.println("Data after using adapter:");
        System.out.println(toString());

    }

    private double convertFintoC(double inF) {

        double convertedTmp = (inF - 32)*0.556;
        return convertedTmp;
    }

    private double convertKnintoMs(double inKn) {

        double convertedSpd = inKn/1.944;
        return convertedSpd;
    }

    @Override
    public String toString() {
        return "Adapter for [wthrSer = " + weatherService.getClass().getSimpleName() + ", Converted data -> temp = " + temp + " in Celsius, spd = " + spd + " m/s]";
    }

}