package vjezba2.zadatak3.weather_station.view;

import net.miginfocom.swing.MigLayout;
import vjezba2.zadatak3.weather_station.model.NewMobileApp;
import javax.swing.*;

public class Mainframe extends JFrame {

    private JTextArea textArea;
    private JScrollPane scrollPane;
    private JButton register;
    private JButton unregister;
    private JComboBox<NewMobileApp> comboBox;

    public Mainframe() {
        super("Weather Station");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 500);
        this.setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);

        initComps();
        layoutComps();
        activateFrame();
    }

    private void initComps() {
        comboBox = new JComboBox<>();
        textArea = new JTextArea();
        scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        register = new JButton("Register");
        unregister = new JButton("Unregister");
    }

    private void layoutComps() {
        setLayout(new MigLayout());
        add(register, "split 3");
        add(unregister, "wrap");
        add(comboBox, "grow, push, wrap");
        add(scrollPane, "span 2, grow, push, wrap");

    }

    private void activateFrame() {

    }
}
