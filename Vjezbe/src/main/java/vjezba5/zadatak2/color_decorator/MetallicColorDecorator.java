package vjezba5.zadatak2.color_decorator;

import vjezba5.zadatak2.model.Car;

public class MetallicColorDecorator extends ColorDecorator{

    public MetallicColorDecorator(Car decoratedCar) {
        super(decoratedCar, "metallic", 1500); // Cijena za metalik boju
    }
}
