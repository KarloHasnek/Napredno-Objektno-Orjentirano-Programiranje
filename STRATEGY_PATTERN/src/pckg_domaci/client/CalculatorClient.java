package pckg_domaci.client;

import pckg_domaci.strategy.Addition;
import pckg_domaci.strategy.Calculate;

public class CalculatorClient {

    private int a;
    private int b;
    private Calculate operation;

    public CalculatorClient() {
        this.operation = new Addition();
    }

    public CalculatorClient(int a, int b, Calculate operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public Calculate getCalculate() {
        return operation;
    }

    public void setCalculate(Calculate operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "a=" + a +
                ", b=" + b +
                ", operation=" + operation +
                '}';
    }

    public void performCalculation() {
        System.out.println("doing "+ this.getCalculate() + " using numbers: " + a + " and " + b);
        operation.calculate(a, b);
    }
}
