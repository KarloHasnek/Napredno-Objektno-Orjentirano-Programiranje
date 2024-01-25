package vjezba1.zadatak1.model;

public class CalculatorTest extends Calculator{
    @Override
    protected float performCalculation(float firstNum, float secondNum) {
        float result = calculation.calculate(firstNum, secondNum);
        soutRes(result);
        return result;
    }

    public static void main(String[] args) {
        CalculationStrategy calculation = new AddStrategy();
        CalculatorTest calc = new CalculatorTest();
        calc.setCalculation(calculation);
        calc.performCalculation(5, 5);
    }
}
