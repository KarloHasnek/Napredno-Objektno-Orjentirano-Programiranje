package vjezba1.zadatak1.view;

import vjezba1.zadatak1.model.CalculationStrategy;

import java.util.EventObject;

public class InputPanelEvent extends EventObject {

    private float firstNumber;
    private float secondNumber;
    private CalculationStrategy calculationStrategy;
    /**
     * Constructs a prototypical Event.
     *
     * @param source              the object on which the Event initially occurred
     * @param firstNumber
     * @param secondNumber
     * @param calculationStrategy
     * @throws IllegalArgumentException if source is null
     */
    public InputPanelEvent(Object source, float firstNumber, float secondNumber, CalculationStrategy calculationStrategy) {
        super(source);
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.calculationStrategy = calculationStrategy;
    }


    public float getFirstNumber() {
        return firstNumber;
    }

    public float getSecondNumber() {
        return secondNumber;
    }

    public CalculationStrategy getCalculationStrategy() {
        return calculationStrategy;
    }
}
