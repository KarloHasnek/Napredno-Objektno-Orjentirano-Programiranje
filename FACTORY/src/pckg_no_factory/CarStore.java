package pckg_no_factory;

public class CarStore {

    private String storeName;

    public CarStore(String storeName) {
        this.storeName = storeName;
    }

    public Car orderCar(String type, String brand, String model) {

        switch (type) {
            case "SUV":
                return new SUV(brand, model);
            case "Sedan":
                return new Sedan(brand, model);
            default:
                System.out.println("You chose an invalid car type");
                throw new IllegalArgumentException("Invalid car type!");
        }
    }
}
