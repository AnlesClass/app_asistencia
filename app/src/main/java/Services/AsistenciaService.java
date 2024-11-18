package Services;

import Database.Conexion;
import Entities.Asistencia;
import GUI.DialogAlert;
import Interfaces.ICRUD;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class AsistenciaService implements ICRUD<Asistencia>{

    DialogAlert dialog = new DialogAlert("Asistencia");
    Connection cn = null;
    
    @Override
    public boolean agregar(Asistencia entity) {
        String sql = "INSERT INTO Asistencias(idUsuario, fecha, horaEntrada, horaSalida, idEstado) VALUES (?,?,?,?,?);";
        
        try {
            cn = Conexion.getMySQL();    
            
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, entity.getIdUsuario());
            ps.setDate(2, Date.valueOf(entity.getFecha()));
            ps.setTime(3, Time.valueOf(entity.getHoraEntrada()));
            if (entity.getHoraSalida() == null) {
                ps.setNull(4, Types.TIME);
            } else {
                ps.setTime(4, Time.valueOf(entity.getHoraSalida()));
            }
            ps.setInt(5, entity.getIdEstado());
            
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
            dialog.showAlert(500, e);
        }
        
        return false;
    }

    @Override
    public boolean modificar(Asistencia entity) {
        String sql = "UPDATE Asistencias SET idUsuario=?, fecha=?, horaEntrada=?, horaSalida=?, idEstado=? WHERE idAsistencia=?;";
        
        try {    
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, entity.getIdUsuario());
            ps.setDate(2, Date.valueOf(entity.getFecha()) );
            ps.setTime(3, Time.valueOf(entity.getHoraEntrada()));
            ps.setTime(4, Time.valueOf(entity.getHoraSalida()));
            ps.setInt(5, entity.getIdEstado());
            ps.setInt(6, entity.getIdAsistencia());
            
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
    public Asistencia leer(int id) {
        String sql = "SELECT * FROM Asistencias WHERE idAsistencia=" + String.valueOf(id) + ";";
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            if (rs.next()){
                return new Asistencia(
                    rs.getInt(1),
                    rs.getInt(2),
                    rs.getDate(3).toLocalDate(),
                    rs.getTime(4).toLocalTime(),
                    rs.getTime(5).toLocalTime(),
                    rs.getInt(6)
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
    public List<Asistencia> listar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    // Retorna la asistencia del día de hoy basada en el id del usuario, nulo si no existe asistencia.
    public Asistencia getTodayAsistencia(int idUsuario){
        String sql = "SELECT * FROM Asistencias WHERE idUsuario=? AND fecha=CURDATE();";
        
        try {
            cn = Conexion.getMySQL();
            
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, idUsuario);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()){
                LocalTime horaSalida = null;
                if (rs.getTime(5) != null){
                    horaSalida = rs.getTime(5).toLocalTime();
                }
                
                return new Asistencia(
                    rs.getInt(1),
                    rs.getInt(2),
                    rs.getDate(3).toLocalDate(),
                    rs.getTime(4).toLocalTime(),
                    horaSalida,
                    rs.getInt(6)
                );
            } else {
                return null;
            }
        } catch (SQLException e) {
            dialog.showAlert(400, e);
        }
        
        return null;
    }
}
