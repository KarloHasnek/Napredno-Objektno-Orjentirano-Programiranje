package pckg_domaci.strategy;

public class Addition implements Calculate {

    @Override
    public void calculate(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    @Override
    public String toString() {
        return "Addition";
    }
}
