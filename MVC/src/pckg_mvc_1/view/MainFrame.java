package pckg_mvc_1.view;

import pckg_mvc_1.controller.AppController;
import pckg_mvc_1.model.Programmer;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.List;

public class MainFrame extends JFrame {

    private ViewPanel viewPanel;
    private FormPanel formPanel;
    private AppController controller;
    private JMenuBar menuBar;
    private JFileChooser fileChooser;


    public MainFrame(){
        super("Simple App");

        initAll();
        layoutComps();
        activateMainFrame();
    }

    private void activateMainFrame() {

        formPanel.setFormPanelListener(new FormPanelListener() {
            @Override
            public void formEventOccurred(FormEvent fe) {
                Programmer programmer = fe.getProgrammer();
                viewPanel.appendText(programmer.toString());
                controller.addNewProgrammerToDatabase(programmer);
            }
        });
    }

    private void layoutComps() {
        setLayout(new BorderLayout());
        add(viewPanel, BorderLayout.NORTH);
        add(formPanel, BorderLayout.CENTER);
    }

    private void initAll() {

        setSize(700, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        menuBar = createMenuBar();

        viewPanel = new ViewPanel();
        formPanel = new FormPanel();
        controller = new AppController();
        setJMenuBar(menuBar);
        fileChooser = new JFileChooser("DATA");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("BIN, TXT, CSV", "txt", "bin", "csv");
        fileChooser.addChoosableFileFilter(filter);
        fileChooser.setAcceptAllFileFilterUsed(true);
    }

    private JMenuBar createMenuBar(){
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");

        JMenuItem showDataItem = new JMenuItem("Show all data");
        JMenuItem importDataItem = new JMenuItem("Import Data...");
        JMenuItem exportDataItem = new JMenuItem("Export Data...");
        JMenuItem exitItem = new JMenuItem("Exit");

        fileMenu.add(showDataItem);
        fileMenu.add(importDataItem);
        fileMenu.add(exportDataItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        showDataItem.addActionListener(e -> {
            controller.showAllDataFromDatabaseOnViewPanel(viewPanel);
        });

        exitItem.addActionListener(e -> {
            int action = JOptionPane.showConfirmDialog(MainFrame.this, "Do you really want to exit the application?",
                    "Confirm Exit", JOptionPane.OK_CANCEL_OPTION);
            if(action == JOptionPane.OK_OPTION){
                System.exit(0);
            }
        });

        exportDataItem.addActionListener(e -> {
            int val = fileChooser.showOpenDialog(MainFrame.this);
            if(val == JFileChooser.APPROVE_OPTION){
                System.out.println(fileChooser.getSelectedFile());
                File file = fileChooser.getSelectedFile();
                controller.saveDataToFile(file);
            }
        });

        importDataItem.addActionListener(e -> {

            JOptionPane.showMessageDialog(MainFrame.this, "current data will be lost", "Warning", JOptionPane.WARNING_MESSAGE);

            int val = fileChooser.showOpenDialog(MainFrame.this);
            if(val == JFileChooser.APPROVE_OPTION){
                System.out.println(fileChooser.getSelectedFile());
                File file = fileChooser.getSelectedFile();
                List<Programmer> programmerList = controller.loadDataFromFile(file);
                viewPanel.showDataFromDatabase(programmerList);
            }
        });


        menuBar.add(fileMenu);

        return menuBar;
    }
}
