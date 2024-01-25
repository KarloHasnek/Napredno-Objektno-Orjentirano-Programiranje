package vjezba1.zadatak1.model;

public class MultiplyStrategy implements CalculationStrategy {

    @Override
    public float calculate(float a, float b) {
        return a * b;
    }

    @Override
    public String toString() {
        return "Multiply";
    }
}
