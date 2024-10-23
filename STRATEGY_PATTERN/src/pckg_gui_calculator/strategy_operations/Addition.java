package pckg_gui_calculator.strategy_operations;


public class Addition implements CalculationStrategy {

    @Override
    public double calculate(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    @Override
    public String toString() {
        return "Addition";
    }
}
