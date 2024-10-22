package pckg_domaci.client;

import pckg_domaci.strategy.Addition;
import pckg_domaci.strategy.Division;

public class App {

    public static void main(String[] args) {

        CalculatorClient calculator = new CalculatorClient(2, 5, new Addition());
        calculator.performCalculation();

        calculator.setA(10);
        calculator.setB(20);
        calculator.setCalculate(new Division());
        calculator.performCalculation();
    }
}
