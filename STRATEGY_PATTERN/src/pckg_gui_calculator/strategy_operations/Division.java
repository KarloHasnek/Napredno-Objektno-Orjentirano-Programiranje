package pckg_gui_calculator.strategy_operations;

public class Division implements CalculationStrategy {

    @Override
    public double calculate(double firstNumber, double secondNumber) {
        if (secondNumber == 0) {
            System.out.println("Division by zero is not allowed");
            throw new ArithmeticException("Division by zero error");
        } else {
            return firstNumber / secondNumber;
        }
    }

    @Override
    public String toString() {
        return "Division";
    }
}
