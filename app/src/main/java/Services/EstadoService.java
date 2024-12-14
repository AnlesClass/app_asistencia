package Services;

import Database.Conexion;
import Entities.Estado;
import Interfaces.ICRUD;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EstadoService implements ICRUD<Estado>{

    DialogAlert dialog = new DialogAlert("Estado");
    Connection cn = null;
    
    @Override
    public boolean agregar(Estado entity) {
        String sql = "INSERT INTO Estados(nombre, abreviatura) VALUES (?,?);";
        
        try {
            cn = Conexion.getMySQL();    
            
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, entity.getNombre());
            ps.setString(2, entity.getAbreviatura());
            
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
    public boolean modificar(Estado entity) {
        String sql = "UPDATE Estados SET nombre=?, abreviatura=? WHERE idEstado=?;";
        
        try {    
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, entity.getNombre());
            ps.setString(2, entity.getAbreviatura());
            ps.setInt(3, entity.getIdEstado());
            
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
    public Estado leer(int id) {
        String sql = "SELECT * FROM Estados WHERE idEstado=" + String.valueOf(id) + ";";
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            if (rs.next()){
                return new Estado(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3)
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
    public List<Estado> listar() {
        String sql = "SELECT * FROM Estados;";
        List<Estado> estados = new ArrayList<>();
        
        try {
            cn = Conexion.getMySQL();
            
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                Estado estado = new Estado(
                    rs.getInt(1), 
                    rs.getString(2), 
                    rs.getString(3)
                );
                estados.add(estado);
            }
            
            // MOSTRAR DIALOGOS
            if (estados.size() < 1){
                dialog.genericDialog("¡No se hallaron resultados!", 1);
            }
            
            return estados;
        } catch (SQLException e) {
            dialog.showAlert(500, e);
        }
        
        return estados;
    }
    
    public int getIdEstado(String nombreEstado){
        String sql = "SELECT idEstado FROM Estados WHERE nombre=?;";
        
        try {
            cn = Conexion.getMySQL();
            
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, nombreEstado);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()){
                return rs.getInt(1);
            } else {
                dialog.showAlert(400);
            }
        } catch (SQLException e) {
            dialog.showAlert(400, e);
        }
        return 0;
    };
}
