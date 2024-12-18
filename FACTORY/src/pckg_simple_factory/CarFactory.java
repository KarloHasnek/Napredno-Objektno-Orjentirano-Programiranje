package pckg_simple_factory;

public class CarFactory {

    public static Car produceCar(String type, String brand, String model) throws IllegalArgumentException {
        return switch (type) {
          case "SUV" -> new SUV(brand, model);
            case "Sedan" -> new Sedan(brand, model);
            default -> throw new IllegalArgumentException("Invalid car type: " + type);
        };
    }
}
