package pckg_domaci.strategy;

public class Division implements Calculate {

    @Override
    public void calculate(int a, int b) {


        if (b == 0) {
            System.out.println("Division: Can't divide by zero");
        } else {
            float result = (float) a / b;
            System.out.println("Division: " + result);
        }
    }

    @Override
    public String toString() {
        return "Division";
    }
}
