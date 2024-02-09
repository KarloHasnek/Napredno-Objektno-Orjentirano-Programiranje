package vjezba5.zadatak2.seat_covers_decorator;

import vjezba5.zadatak2.model.Car;

public abstract class SeatCoversDecorator implements Car {

    protected Car decoratedCar;
    protected String seatCovers;
    protected double price;

    public SeatCoversDecorator(Car decoratedCar, String seatCovers, double price) {
        this.decoratedCar = decoratedCar;
        this.seatCovers = seatCovers;
        this.price = price;
    }

    @Override
    public double getPrice() {
       return decoratedCar.getPrice() + price;
    }

    @Override
    public String getDescription() {
        return decoratedCar.getDescription() + ", " + seatCovers + " seat covers";
    }
}
