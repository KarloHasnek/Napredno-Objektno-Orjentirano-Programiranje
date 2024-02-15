package vjezba8.MVC.app;

import vjezba8.MVC.view.AppFrame;

import javax.swing.SwingUtilities;

public class AppCli {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                new AppFrame();

            }
        });
    }

}