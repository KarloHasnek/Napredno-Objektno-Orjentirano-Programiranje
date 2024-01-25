package vjezba1.zadatak1.view;

import net.miginfocom.swing.MigLayout;
import org.reflections.Reflections;
import vjezba1.zadatak1.model.CalculationStrategy;

import javax.swing.*;
import java.util.Set;

public class InputPanel extends JPanel {

    private JTextField firstNumber;
    private JTextField secondNumber;
    private JComboBox<CalculationStrategy> calculationOptions;
    private JButton calculateButton;

    private InputListener inputListener;

    public InputPanel() {

        setBorder(BorderFactory.createTitledBorder("Input"));

        initComps();
        layoutComps();
        activateComps();
    }

    private void initComps() {
        firstNumber = new JTextField("");
        secondNumber = new JTextField("");
        calculationOptions = new JComboBox<>(getCalculationStrategies());
        calculateButton = new JButton("Calculate");

    }

    private void layoutComps() {
        setLayout(new MigLayout("gapy 20"));
        add(new JLabel("First Number:"), "wrap");
        add(firstNumber, "wrap");
        add(new JLabel("Second Number:"), "wrap");
        add(secondNumber, "wrap");
        add(new JLabel("Calculation:"), "wrap");
        add(calculationOptions, "wrap");
        add(calculateButton, "wrap");
    }

    private void activateComps() {
        calculateButton.addActionListener(e -> {
            System.out.println("Calculate button pressed");
            float firstNum = Float.parseFloat(firstNumber.getText());
            float secondNum = Float.parseFloat(secondNumber.getText());
            CalculationStrategy calculationStrategy = (CalculationStrategy) calculationOptions.getSelectedItem();

            InputPanelEvent event = new InputPanelEvent(this, firstNum, secondNum, calculationStrategy);

            if (inputListener != null) {
                inputListener.inputEventOccured(event);
            }
        });
    }

    private CalculationStrategy[] getCalculationStrategies() {
        Reflections reflections = new Reflections("vjezba1.zadatak1.model");
        Set<Class<? extends CalculationStrategy>> classes = reflections.getSubTypesOf(CalculationStrategy.class);

        return classes.stream()
                .map(this::createInstance)
                .toArray(CalculationStrategy[]::new);
    }

    private CalculationStrategy createInstance(Class<? extends CalculationStrategy> calcStrategyClass) {
        try {
            return calcStrategyClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Failed to create instance of " + calcStrategyClass, e);
        }
    }
}
