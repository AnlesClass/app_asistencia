package Services;

import Database.Conexion;
import Entities.Dia;
import Interfaces.ICRUD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DiaService implements ICRUD<Dia> {

    DialogAlert dialog = new DialogAlert("Estado");
    Connection cn = null;
    
    @Override
    public boolean agregar(Dia entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean modificar(Dia entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Dia leer(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Dia> listar() {
        String sql = "SELECT * FROM Dias;";
        List<Dia> dias = new ArrayList<>();
        
        try {
            cn = Conexion.getMySQL();
            
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                Dia dia = new Dia(
                    rs.getInt(1), 
                    rs.getString(2)
                );
                dias.add(dia);
            }
            
            // MOSTRAR DIALOGOS
            if (dias.size() < 1){
                dialog.genericDialog("¡No se hallaron resultados!", 1);
            }
            
            return dias;
        } catch (SQLException e) {
            dialog.showAlert(500, e);
        }
        
        return dias;
    }
}
