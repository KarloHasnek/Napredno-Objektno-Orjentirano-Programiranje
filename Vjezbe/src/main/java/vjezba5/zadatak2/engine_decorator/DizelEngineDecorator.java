package vjezba5.zadatak2.engine_decorator;

import vjezba5.zadatak2.model.Car;

public class DizelEngineDecorator extends CarEngineDecorator {
    public DizelEngineDecorator(Car decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 5000; // Cijena dizel motora
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", diesel motor";
    }
}
