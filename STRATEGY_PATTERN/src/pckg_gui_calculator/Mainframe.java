package pckg_gui_calculator;

import javax.swing.*;

public class Mainframe extends JFrame {

    private ViewPanel viewPanel;
    private FormPanel formPanel;

    public Mainframe() {

        super("Calculator");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

        initComps();
        layoutComps();
        activateComps();
    }

    private void initComps() {
        viewPanel = new ViewPanel();
        formPanel = new FormPanel();
    }

    private void layoutComps() {
        add(viewPanel);
        add(formPanel);
    }

    private void activateComps() {

    }


}
