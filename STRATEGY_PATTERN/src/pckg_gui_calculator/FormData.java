package pckg_gui_calculator;

import pckg_gui_calculator.strategy_operations.CalculationStrategy;

import java.io.Serializable;

public record FormData(double first, double second, double result, CalculationStrategy calculationStrategy) implements Serializable {

    @Override
    public String toString() {
        return "CalculationFormData{" +
                "first=" + first +
                ", second=" + second +
                ", result=" + result +
                ", calculationStrategy=" + calculationStrategy +
                '}';
    }

}
