package pckg_gui_calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Toolbar extends JPanel implements ActionListener {

    private JButton saveAsTextButton;
    private JButton saveObjectsButton;
    private JButton loadTextButton;
    private JButton loadObjectsButton;
    private JButton clearButton;
    private ToolbarListener toolbarListener;

    public Toolbar() {

        initComps();
        layoutComps();
        activateComps();
    }

    private void initComps() {
        this.saveAsTextButton = new JButton("Save txt");
        this.saveObjectsButton = new JButton("Save bin");
        this.loadObjectsButton = new JButton("Load bin");
        this.loadTextButton = new JButton("Load txt");
        this.clearButton = new JButton("Clear");

    }

    private void layoutComps() {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(saveAsTextButton);
        add(saveObjectsButton);
        add(loadObjectsButton);
        add(loadTextButton);
        add(clearButton);

    }

    private void activateComps() {
        saveAsTextButton.addActionListener(this);
        saveAsTextButton.setActionCommand("save TXT");
        saveObjectsButton.addActionListener(this);
        saveObjectsButton.setActionCommand("save BIN");
        loadObjectsButton.addActionListener(this);
        loadObjectsButton.setActionCommand("load BIN");
        loadTextButton.addActionListener(this);
        loadTextButton.setActionCommand("load TXT");
        clearButton.addActionListener(this);
        clearButton.setActionCommand("clear");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == saveAsTextButton) {
            System.out.println("Clicked: " + saveAsTextButton.getActionCommand());
            if (toolbarListener != null) {
                toolbarListener.toolbarEventOccured(saveAsTextButton.getActionCommand());
            }
        }

        if(ae.getSource() == saveObjectsButton) {
            System.out.println("Clicked: " + saveObjectsButton.getActionCommand());
            if (toolbarListener != null) {
                toolbarListener.toolbarEventOccured(saveObjectsButton.getActionCommand());
            }
        }

        if(ae.getSource() == loadObjectsButton) {
            System.out.println("Clicked: " + loadObjectsButton.getActionCommand());
            if (toolbarListener != null) {
                toolbarListener.toolbarEventOccured(loadObjectsButton.getActionCommand());
            }
        }

        if(ae.getSource() == loadTextButton) {
            System.out.println("Clicked: " + loadTextButton.getActionCommand());
            if (toolbarListener != null) {
                toolbarListener.toolbarEventOccured(loadTextButton.getActionCommand());
            }
        }

        if(ae.getSource() == clearButton) {
            System.out.println("Clicked: " + clearButton.getActionCommand());
            if (toolbarListener != null) {
                toolbarListener.toolbarEventOccured(clearButton.getActionCommand());
            }
        }
    }

    public void setToolbarListener(ToolbarListener toolbarListener) {
        this.toolbarListener = toolbarListener;
    }
}
