package vjezba5.zadatak2.seat_covers_decorator;

import vjezba5.zadatak2.model.Car;

public class WoolSeats extends SeatCoversDecorator{
    public WoolSeats(Car decoratedCar) {
        super(decoratedCar, "Wool", 750);
    }
}
