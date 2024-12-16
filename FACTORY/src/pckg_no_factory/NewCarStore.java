package pckg_no_factory;

public class NewCarStore {

    private Car car;

    public  NewCarStore() {
        System.out.println("New car store created!");
    }

    public void orderCar(String type, String brand, String model) {
        try {
            car = CarFactory.produceCar(type, brand, model);
            System.out.println("Car ordered: " + car);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
