package Services;

import Database.Conexion;
import Entities.DetalleTurno;
import Interfaces.ICRUD;
import java.sql.*;
import java.util.List;

public class DetalleTurnoService implements ICRUD<DetalleTurno>{

    DialogAlert dialog = new DialogAlert("Detale del Turno");
    Connection cn = null;
    
    @Override
    public boolean agregar(DetalleTurno entity) {
        String sql = "INSERT INTO DetalleTurnos(idUsuario, idTurno, dia) VALUES (?,?,?);";
        
        try {
            cn = Conexion.getMySQL();    
            
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, entity.getIdUsuario());
            ps.setInt(2, entity.getIdTurno());
            ps.setString(3, entity.getDia());
            
            int result = ps.executeUpdate();
            
            // MOSTRAR dialogo.
            if (result == 1){
                dialog.showAlert(202);
                return true;
            } else {
                dialog.showAlert(500);
                return false;
            }
        } catch (SQLException e) {
            dialog.showAlert(500);
        }
        
        return false;
    }

    @Override
    public boolean modificar(DetalleTurno entity) {
        String sql = "UPDATE DetalleTurnos SET idUsuario=?, idTurno=?, dia=? WHERE idDetalleTurno=?;";
        
        try {    
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, entity.getIdUsuario());
            ps.setInt(2, entity.getIdTurno());
            ps.setString(3, entity.getDia());
            ps.setInt(4, entity.getIdDetalleTurno());
            
            int result = ps.executeUpdate();
            if (result > 0){
                dialog.showAlert(200);
                return true;
            }
        } catch (SQLException e) {
            dialog.showAlert(500, e);
            return false;
        }
        
        return false;
    }

    @Override
    public DetalleTurno leer(int id) {
        String sql = "SELECT * FROM DetalleTurnos WHERE idDetalleTurno=" + String.valueOf(id) + ";";
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            if (rs.next()){
                return new DetalleTurno(
                    rs.getInt(1),
                    rs.getInt(2),
                    rs.getInt(3),
                    rs.getString(4)
                );
            } else {
                dialog.showAlert(500);
            }
        } catch (SQLException ex) {
            dialog.showAlert(500);
        }
        
        return null;
    }

    @Override
    public List<DetalleTurno> listar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
