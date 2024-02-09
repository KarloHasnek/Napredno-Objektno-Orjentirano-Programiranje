package vjezba5.zadatak2.engine_decorator;

import vjezba5.zadatak2.model.Car;

public abstract class CarEngineDecorator implements Car {

    protected Car decoratedCar;

    public CarEngineDecorator(Car decoratedCar) {
        this.decoratedCar = decoratedCar;
    }

    @Override
    public double getPrice() {
        return decoratedCar.getPrice();
    }

    @Override
    public String getDescription() {
        return decoratedCar.getDescription();
    }
}

