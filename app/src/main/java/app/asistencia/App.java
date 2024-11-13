package app.asistencia;

import GUI.CreateUsuario;
import GUI.Home;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
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
