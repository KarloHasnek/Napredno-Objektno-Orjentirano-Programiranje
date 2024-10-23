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
    public void actionPerformed(ActionEvent e) {

    }
}
