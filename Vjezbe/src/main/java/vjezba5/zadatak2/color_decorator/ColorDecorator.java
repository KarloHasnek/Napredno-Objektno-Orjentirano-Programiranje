package vjezba5.zadatak2.color_decorator;

import vjezba5.zadatak2.model.Car;

public abstract class ColorDecorator implements Car {

    protected Car decoratedCar;
    protected String color;
    protected double price;

    public ColorDecorator(Car decoratedCar, String color, double price) {
        this.decoratedCar = decoratedCar;
        this.color = color;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return decoratedCar.getPrice() + price;
    }

    @Override
    public String getDescription() {
        return decoratedCar.getDescription() + ", " + color + " color";
    }
}
