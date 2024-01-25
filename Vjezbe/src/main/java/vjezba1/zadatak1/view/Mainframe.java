package vjezba1.zadatak1.view;

import net.miginfocom.swing.MigLayout;
import vjezba1.zadatak1.model.SimpleCalculator;

import javax.swing.*;

public class Mainframe extends JFrame {

    private InputPanel inputPanel;
    private JTextField resultField;
    private JTextArea allResultsArea;
    private SimpleCalculator calculator;

    public Mainframe() {
        setSize(800, 600);
        setTitle("Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);

        initComps();
        layoutComps();
        activateComps();
    }

    private void initComps(){
        inputPanel = new InputPanel();
        resultField = new JTextField();
        resultField.setEditable(false);
        allResultsArea = new JTextArea();
        allResultsArea.setLineWrap(true);
        allResultsArea.setBorder(BorderFactory.createTitledBorder("All results"));
        allResultsArea.setEditable(true);
        calculator = new SimpleCalculator();

    }

    private void layoutComps(){
        setLayout(new MigLayout("fill"));
        add(inputPanel, "spany, grow, w 350");
        add(new JLabel("Result:"), "gapx 20,gapy 20, wrap");
        add(resultField, "gapx 20, w 150, wrap");
        add(allResultsArea, "grow, pushy");

    }

    private void activateComps() {

    }
}
