package pckg_gui_calculator;

import com.sun.tools.javac.Main;
import pckg_gui_calculator.load_strategy.LoadTextStrategy;
import pckg_gui_calculator.strategy_save.SaveTextStrategy;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Mainframe extends JFrame {

    private ViewPanel viewPanel;
    private FormPanel formPanel;
    private Toolbar toolbar;
    private final List<String> txtData;

    public Mainframe() {

        super("Calculator");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

        this.txtData = new ArrayList<>();

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
                txtData.add(formRecord.toString());
            }
        });

        toolbar.setToolbarListener(new ToolbarListener() {
            @Override
            public void toolbarEventOccured(String buttonActionCommandString) {
                if (buttonActionCommandString.equals("save TXT")) {
                    SaveTextStrategy saveTxtStrategy = new SaveTextStrategy();
                    saveTxtStrategy.saveDataToFile("data.txt", txtData);
                }

                if (buttonActionCommandString.equals("clear")) {
                    viewPanel.clearText();
                    txtData.clear();
                    JOptionPane.showMessageDialog(Mainframe.this, "Data cleared", "Info", JOptionPane.INFORMATION_MESSAGE);
                }

                if (buttonActionCommandString.equals("load TXT")) {
                    LoadTextStrategy loadTxtStrategy = new LoadTextStrategy();
                    List<String> loadedData = loadTxtStrategy.loadData("data.txt");
                    for (String element : loadedData) {
                        viewPanel.appendText(element);
                    }
                    txtData.addAll(loadedData);
                    JOptionPane.showMessageDialog(Mainframe.this, "Data loaded successfully!", "Info", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }


}
