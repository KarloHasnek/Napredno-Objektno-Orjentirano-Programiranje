package vjezba1.zadatak1.model;

public class AddStrategy implements CalculationStrategy{

    @Override
    public float calculate(float a, float b) {
        return a + b;
    }

    @Override
    public String toString() {
        return "Add";
    }
}
