package vjezba2.zadatak3.weather_station.app.TestApp;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import vjezba2.zadatak3.weather_station.view.Mainframe;

import javax.swing.*;

public class TestAppGui {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(new FlatMacLightLaf());
                } catch (UnsupportedLookAndFeelException e) {
                    throw new RuntimeException(e);
                }
                new Mainframe();
            }
        });
    }
}
