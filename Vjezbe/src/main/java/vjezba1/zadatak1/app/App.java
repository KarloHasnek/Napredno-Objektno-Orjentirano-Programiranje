package vjezba1.zadatak1.app;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import vjezba1.zadatak1.view.Mainframe;

import javax.swing.*;

public class App {

    public static void main(String[] args) {


        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Mainframe mainframe = new Mainframe();
            }
        });
    }
}
