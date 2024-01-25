package vjezba1.zadatak1.model;

public abstract class Calculator {

    protected CalculationStrategy calculation;

    protected void soutRes(float number) {
        System.out.println("Result is: " + number + " -- Operation is: " + calculation.toString());
    }

    public void setCalculation(CalculationStrategy calculation) {
        this.calculation = calculation;
    }

    protected abstract float performCalculation(float firstNum, float secondNum);
}
