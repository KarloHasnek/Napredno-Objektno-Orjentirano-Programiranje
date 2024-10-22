package pckg_domaci.strategy;

public class Subtraction implements Calculate {

    @Override
    public void calculate(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }

    @Override
    public String toString() {
        return "Subtraction";
    }
}
