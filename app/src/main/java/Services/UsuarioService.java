package Services;

import Database.Conexion;
import Entities.Usuario;
import GUI.DialogAlert;
import Interfaces.ICRUD;
import java.sql.*;
import java.util.List;

public class UsuarioService implements ICRUD<Usuario>{

    DialogAlert dialog = new DialogAlert("Usuario");
    Connection cn = null;
    
    @Override
    public boolean agregar(Usuario entity) {
        String sql = "INSERT INTO Usuarios(idCargo, nombre, apellido, dni, email, contrasenia, fechaContrato) VALUES (?,?,?,?,?,?,?);";
        
        try {
            cn = Conexion.getMySQL();    
            
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, entity.getIdCargo());
            ps.setString(2, entity.getNombre());
            ps.setString(3, entity.getApellido());
            ps.setString(4, entity.getDni());
            ps.setString(5, entity.getEmail());
            ps.setString(6, entity.getContrasenia());
            ps.setDate(7, Date.valueOf(entity.getFechaContrato()));
            
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
    public boolean modificar(Usuario entity) {
        String sql = "UPDATE Usuarios SET idCargo=?, nombre=?, apellido=?, dni=?, email=?, contrasenia=?, fechaContrato=? WHERE idUsuario=?;";
        
        try {    
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, entity.getIdCargo());
            ps.setString(2, entity.getNombre());
            ps.setString(3, entity.getApellido());
            ps.setString(4, entity.getDni());
            ps.setString(5, entity.getEmail());
            ps.setString(6, entity.getContrasenia());
            ps.setDate(7, Date.valueOf(entity.getFechaContrato()));
            ps.setInt(8, entity.getIdUsuario());
            
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
    public Usuario leer(int id) {
        String sql = "SELECT * FROM Usuarios WHERE idUsuario=" + String.valueOf(id) + ";";
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            if (rs.next()){
                dialog.showAlert(200);
                return new Usuario(
                    rs.getInt(1),
                    rs.getInt(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getDate(8).toLocalDate()
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
    public List<Usuario> listar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
