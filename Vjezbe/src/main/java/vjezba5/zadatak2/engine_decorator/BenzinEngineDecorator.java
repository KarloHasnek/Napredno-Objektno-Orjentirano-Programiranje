package vjezba5.zadatak2.engine_decorator;

import vjezba5.zadatak2.model.Car;

public class BenzinEngineDecorator extends CarEngineDecorator {
    public BenzinEngineDecorator(Car decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 6000; // Cijena benzin motora
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", benzin motor";
    }
}
