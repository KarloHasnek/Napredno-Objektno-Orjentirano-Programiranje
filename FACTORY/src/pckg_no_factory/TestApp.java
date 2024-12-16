package pckg_no_factory;

public class TestApp {

    public static void main(String[] args) {

        // No factory car production
        Car car1 = new SUV("Audi", "Q7");
        Car car2 = new Sedan("BMW", "3 Series");
        car1.produceCar();
        car2.produceCar();

        System.out.println("-----------------------------------------------");

        // Simple factory car production
        NewCarStore newCarStore = new NewCarStore();
        newCarStore.orderCar("SUV", "Mercedes", "GLE");
    }
}
