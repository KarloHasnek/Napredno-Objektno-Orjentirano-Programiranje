package vjezba1.zadatak1.model;

public class SimpleCalculator extends Calculator{

    @Override
    protected float performCalculation(float firstNum, float secondNum) {
        float result = calculation.calculate(firstNum, secondNum);
        soutRes(result);
        return result;
    }
}
