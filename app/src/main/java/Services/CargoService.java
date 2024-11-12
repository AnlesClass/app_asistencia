package Services;

import Database.Conexion;
import Entities.Cargo;
import GUI.DialogAlert;
import Interfaces.ICRUD;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CargoService implements ICRUD<Cargo>{

    DialogAlert dialog = new DialogAlert("Cargo");
    Connection cn = null;
    
    public CargoService(){
        cn = Conexion.getMySQL();   
    }
    
    @Override
    public boolean agregar(Cargo entity) {
        String sql = "INSERT INTO Cargos(nombre, descripcion) VALUES (?,?);";
        
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, entity.getNombre());
            ps.setString(2, entity.getDescripcion());
            
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
    public boolean modificar(Cargo entity) {
        String sql = "UPDATE Cargos SET nombre=?, descripcion=? WHERE idCargo=?;";
        
        try {    
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, entity.getNombre());
            ps.setString(2, entity.getDescripcion());
            ps.setInt(3, entity.getIdCargo());
            
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
    public Cargo leer(int id) {
        String sql = "SELECT * FROM Cargos WHERE idCargo=" + String.valueOf(id) + ";";
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            if (rs.next()){
                return new Cargo(
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
    public List<Cargo> listar() {
        String sql = "SELECT * FROM Cargos;";
        List<Cargo> cargos = new ArrayList<>();
        
        try {
            cn = Conexion.getMySQL();
            
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                Cargo cargo = new Cargo(
                    rs.getInt(1), 
                    rs.getString(2), 
                    rs.getString(3)
                );
                cargos.add(cargo);
            }
            
            // MOSTRAR DIALOGOS
            if (cargos.size() < 1){
                dialog.genericDialog("¡No se hallaron resultados!", 1);
            }
            
            return cargos;
        } catch (SQLException e) {
            dialog.showAlert(500, e);
        }
        
        return cargos;
    }
    
    public int getIdCargo(String nombreCargo){
        String sql = "SELECT idCargo FROM Cargos WHERE nombre=?;";
        
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, nombreCargo);
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                return rs.getInt(1);
            }else{
                return 0;
            }
        } catch (SQLException e) {
            return 0;
        }
    }
}
