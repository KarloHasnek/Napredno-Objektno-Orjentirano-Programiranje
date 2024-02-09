package vjezba5.zadatak2.app;

import vjezba5.zadatak2.color_decorator.ColorDecorator;
import vjezba5.zadatak2.color_decorator.StandardColorDecorator;
import vjezba5.zadatak2.engine_decorator.DizelEngineDecorator;
import vjezba5.zadatak2.model.BasicCar;
import vjezba5.zadatak2.model.Car;
import vjezba5.zadatak2.seat_covers_decorator.LeatherSeats;

public class AppCli {
    public static void main(String[] args) {
        Car basicCar = new BasicCar();
        basicCar = new DizelEngineDecorator(basicCar);
        System.out.println("Price: " + basicCar.getPrice());
        System.out.println("Description: " + basicCar.getDescription());

        basicCar = new StandardColorDecorator(basicCar);
        System.out.println("Price: " + basicCar.getPrice());
        System.out.println("Description: " + basicCar.getDescription());

        basicCar = new LeatherSeats(basicCar);
        System.out.println("Price: " + basicCar.getPrice());
        System.out.println("Description: " + basicCar.getDescription());
    }
}