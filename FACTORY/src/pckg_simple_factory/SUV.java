package pckg_simple_factory;

public class SUV extends Car {

    protected SUV(String brand, String model) {
        super(brand, model);
    }

    @Override
    protected void produceCar() {
        System.out.println("Producing SUV: " + this.brand + " " + this.model);
    }

    @Override
    public String toString() {
        return "SUV{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
