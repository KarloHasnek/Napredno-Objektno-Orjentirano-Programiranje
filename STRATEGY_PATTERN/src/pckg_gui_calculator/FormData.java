package pckg_gui_calculator;

import pckg_gui_calculator.strategy.CalculationStrategy;

public record FormData(double first, double second, double result, CalculationStrategy calculationStrategy) {

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
