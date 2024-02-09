package vjezba5.zadatak2.seat_covers_decorator;

import vjezba5.zadatak2.model.Car;

public class LeatherSeats extends SeatCoversDecorator {
    public LeatherSeats(Car decoratedCar) {
        super(decoratedCar, "Leather", 2000);
    }
}
