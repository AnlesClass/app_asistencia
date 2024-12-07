package Database;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class Conexion {
    
    //TODO: Cambiar, porque estos son valores para Test.
    final static String URL = "jdbc:mysql://localhost:3306/bd_gestor_asistencia";
    final static String USER = "root";
    final static String PASS = "1234";
    
    public static Connection getMySQL(){
        
        Connection connection = null;
        
        try {
            connection = DriverManager.getConnection(URL, USER, PASS);
            return connection;
        } catch (SQLException e) {
            System.out.println("DEBUG ERROR: No se ha podido establecer conexión: " + e);
        }
        
        // RETORNAR nulo en caso no hayan coincidencias.   
        return connection;
    }
}
