package vjezba5.zadatak2.color_decorator;

import vjezba5.zadatak2.model.Car;

public class StandardColorDecorator extends ColorDecorator {
    public StandardColorDecorator(Car decoratedCar) {
        super(decoratedCar, "standard", 1000); // Cijena za standardnu boju
    }
}
