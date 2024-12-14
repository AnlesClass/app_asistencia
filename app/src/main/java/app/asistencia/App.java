package app.asistencia;

import GUI.Home;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class App {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel( new FlatLightLaf());
            Home home = new Home();
            home.setLocationRelativeTo(null);
            home.setVisible(true);
        } catch( UnsupportedLookAndFeelException ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
    }
}