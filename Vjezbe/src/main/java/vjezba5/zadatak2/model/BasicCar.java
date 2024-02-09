package vjezba5.zadatak2.model;


public class BasicCar implements Car {
    private double basePrice = 25000;

    @Override
    public double getPrice() {
        return basePrice;
    }

    @Override
    public String getDescription() {
        return "SUV model AA1";
    }
}
