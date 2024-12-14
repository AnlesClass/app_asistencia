package Services;

import Database.Conexion;
import Entities.Turno;
import Interfaces.ICRUD;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TurnoService implements ICRUD<Turno>{

    DialogAlert dialog = new DialogAlert("Turno");
    Connection cn = null;
    
    @Override
    public boolean agregar(Turno entity) {
        System.out.println("Función Probablemente Innecesaria.");
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean modificar(Turno entity) {
        String sql = "UPDATE Turnos SET nombre=?, horaInicio=?, horaFin=? WHERE idTurno=?;";
        
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, entity.getNombre());
            ps.setTime(2, Time.valueOf(entity.getHoraInicio()));
            ps.setTime(3, Time.valueOf(entity.getHoraFin()));
            ps.setInt(4, entity.getIdTurno());
            
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
    public Turno leer(int id) {
                String sql = "SELECT * FROM Usuarios WHERE idUsuario=" + String.valueOf(id) + ";";
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            if (rs.next()){
                return new Turno(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getTime(3).toLocalTime(),
                    rs.getTime(4).toLocalTime()
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
    public List<Turno> listar() {
        String sql = "SELECT * FROM Turnos;";
        List<Turno> turnos = new ArrayList<>();
        
        try {
            cn = Conexion.getMySQL();
            
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                Turno estado = new Turno(
                    rs.getInt(1), 
                    rs.getString(2), 
                    rs.getTime(3).toLocalTime(),
                    rs.getTime(4).toLocalTime()
                );
                turnos.add(estado);
            }
            
            // MOSTRAR DIALOGOS
            if (turnos.size() < 1){
                dialog.genericDialog("¡No se hallaron resultados!", 1);
            }
            
            return turnos;
        } catch (SQLException e) {
            dialog.showAlert(500, e);
        }
        
        return turnos;
    }
}
