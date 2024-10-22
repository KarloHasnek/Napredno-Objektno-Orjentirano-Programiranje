package pckg_domaci.strategy;

public class Multiplication implements Calculate {

    @Override
    public void calculate(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }

    @Override
    public String toString() {
        return "Multiplication";
    }
}
