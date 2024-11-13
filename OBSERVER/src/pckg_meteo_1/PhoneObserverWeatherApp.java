package pckg_meteo_1;

import java.util.ArrayList;
import java.util.List;

public class PhoneObserverWeatherApp implements Observer, Display {

    private float temp;
    private float hum;
    private float press;

    @Override
    public void display() {
        System.out.println("Phone display:\n-----------------");
        System.out.println("Temperature: " + temp
                + "C, Humidity: " + hum
                + "%, Pressure: " + press + "hPa");
    }

    @Override
    public void update(float f, float h, float p) {
        this.temp = f;
        this.hum = h;
        this.press = p;
        System.out.println("Everything is up to date!\n");
        System.out.println(Integer.toHexString(this.hashCode())+"@" + getClass().getSimpleName());
        display();
    }

    @Override
    public void register(Observable observable) {
        observable.add(this);

    }

    @Override
    public void unregister(Observable observable) {
        observable.remove(this);
    }
}
