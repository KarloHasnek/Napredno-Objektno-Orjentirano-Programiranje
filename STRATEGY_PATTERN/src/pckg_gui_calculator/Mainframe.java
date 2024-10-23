package pckg_gui_calculator;

import javax.swing.*;
import java.awt.*;

public class Mainframe extends JFrame {

    private ViewPanel viewPanel;
    private FormPanel formPanel;
    private Toolbar toolbar;

    public Mainframe() {

        super("Calculator");
        setSize(800, 600);
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
        toolbar = new Toolbar();
    }

    private void layoutComps() {
        setLayout(new BorderLayout());
        add(viewPanel, BorderLayout.CENTER);
        add(formPanel, BorderLayout.SOUTH);
        add(toolbar, BorderLayout.NORTH);
    }

    private void activateComps() {
        formPanel.setFormPanelListener(new FormPanelListener() {
            @Override
            public void formPanelEventOccured(FormData formRecord) {
                viewPanel.appendText(formRecord.toString());
            }
        });
    }


}
