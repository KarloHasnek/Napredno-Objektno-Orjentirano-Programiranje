package pckg_gui_calculator;

import pckg_gui_calculator.strategy.*;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormPanel extends JPanel {

    private JTextField firstNumberField;
    private JTextField secondNumberField;
    private JTextField resultField;
    private JComboBox<CalculationStrategy> operationComboBox;
    private JButton submitButton;
    private FormPanelListener formPanelListener;

    public FormPanel() {
        Dimension dims = getPreferredSize();
        dims.height = 200;
        dims.width = 390;
        setPreferredSize(dims);
        Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        Border innerBorder = BorderFactory.createTitledBorder("Calculation panel: ");
        Border border = BorderFactory.createCompoundBorder(outerBorder, innerBorder);
        setBorder(border);
        initComps();
        layoutComps();
        activateComps();
    }

    private void initComps() {
        // Initialization of components used for calculator
        firstNumberField = new JTextField(10);
        secondNumberField = new JTextField(10);
        resultField = new JTextField(10);
        resultField.setEditable(false);
        submitButton = new JButton("Calculate");

        // ComboBox setup
        operationComboBox = new JComboBox<>();
        DefaultComboBoxModel<CalculationStrategy> operationModel = new DefaultComboBoxModel<>();
        operationModel.addElement(new Addition());
        operationModel.addElement(new Substraction());
        operationModel.addElement(new Division());
        operationModel.addElement(new Multiplication());
        operationComboBox.setModel(operationModel);
//        Sets the default to be blank instead of the first element
//        operationComboBox.setSelectedIndex(-1);

    }

    private void layoutComps() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(new JLabel("First Number: "), gbc);
        gbc.gridx++;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(firstNumberField, gbc);
        gbc.gridy++;
        add(Box.createVerticalStrut(10), gbc);
        gbc.gridy++;
        add(secondNumberField, gbc);
        gbc.gridx = 0;
        gbc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(new JLabel("Second Number: "), gbc);
        gbc.gridx = 2;
        gbc.gridy++;
        gbc.anchor = GridBagConstraints.CENTER;
        add(operationComboBox);
        gbc.gridx = 1;
        gbc.gridy++;
        add(Box.createVerticalStrut(10), gbc);
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridy++;
        add(resultField, gbc);
        gbc.gridx++;
        gbc.anchor = GridBagConstraints.CENTER;
        add(submitButton, gbc);
    }

    public void setFormPanelListener(FormPanelListener formPanelListener) {
        this.formPanelListener = formPanelListener;
    }

    private void activateComps() {

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("submit button clicked");
                double first = Double.parseDouble(firstNumberField.getText());
                double second = Double.parseDouble(secondNumberField.getText());
                CalculationStrategy calculationStrategy = (CalculationStrategy) operationComboBox.getSelectedItem();
                double result = calculationStrategy.calculate(first, second);
                resultField.setText(String.valueOf(result));
                FormData formData = new FormData(first, second, result, calculationStrategy);
                if (formPanelListener != null) {
                    formPanelListener.formPanelEventOccured(formData);
                    resetForm();
                }
            }
        });
    }

    private void resetForm() {
        firstNumberField.setText("");
        secondNumberField.setText("");
        firstNumberField.requestFocus();
    }
}
