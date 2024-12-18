package pckg_simple_factory;

public class Sedan extends Car{

    protected Sedan(String brand, String model) {
        super(brand, model);
    }

    @Override
    protected void produceCar() {
        System.out.println("Producing Sedan: " + this.brand + " " + this.model);
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
