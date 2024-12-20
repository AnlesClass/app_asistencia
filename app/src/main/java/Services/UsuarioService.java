package Services;

import Database.Conexion;
import Entities.Usuario;
import Interfaces.ICRUD;
import java.sql.*;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class UsuarioService implements ICRUD<Usuario> {

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
            if (result == 1) {
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
            cn = Conexion.getMySQL();

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
            if (result > 0) {
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
            cn = Conexion.getMySQL();

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
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
            }
        } catch (SQLException ex) {
            dialog.showAlert(500);
        }

        return null;
    }

    @Override
    public List<Usuario> listar() {
        String sql = "SELECT * FROM Usuarios;";
        List<Usuario> usuarios = new ArrayList<>();

        try {
            cn = Conexion.getMySQL();

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Usuario usuario = new Usuario(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getDate(8).toLocalDate()
                );
                usuarios.add(usuario);
            }

            // MOSTRAR DIALOGOS
            if (usuarios.size() < 1) {
                dialog.genericDialog("¡No se hallaron resultados!", 1);
            }

            return usuarios;
        } catch (SQLException e) {
            dialog.showAlert(500, e);
        }

        return usuarios;
    }
    
    public List<Usuario> listarAdmins(){
        String sql = "SELECT * FROM Usuarios u INNER JOIN Cargos c ON u.idCargo=c.idCargo WHERE c.isAdmin=1;";
        List<Usuario> usuarios = new ArrayList<>();
        
        try {
            cn = Conexion.getMySQL();
            
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Usuario usuario = new Usuario(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getDate(8).toLocalDate()
                );
                usuarios.add(usuario);
            }

            // MOSTRAR DIALOGOS
            if (usuarios.size() < 1) {
                dialog.genericDialog("¡No se hallaron resultados!", 1);
            }

            return usuarios;
        } catch (SQLException e) {
            dialog.showAlert(500, e);
        }
        
        return usuarios;
    }

    public int getCode() {
        String sql = "SELECT MAX(idUsuario)+1 AS Codigo FROM Usuarios;";

        try {
            cn = Conexion.getMySQL();

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                return rs.getInt(1);
            } else {
                return 0;
            }
        } catch (SQLException e) {
            dialog.showAlert(500, e);
        }

        return 0;
    }

    public LocalTime getEntrada(int idUsuario) {
        String sql = "CALL getEntrada(?,?);";
        LocalTime tiempoDiferencia;

        try {
            cn = Conexion.getMySQL();

            CallableStatement cs = cn.prepareCall(sql);
            cs.setInt(1, idUsuario);
            cs.registerOutParameter(2, java.sql.Types.TIME);

            cs.execute();

            String res = cs.getString(2);

            if (res != null) {
                tiempoDiferencia = LocalTime.parse(res.replace("-", ""));
                return tiempoDiferencia;
            } else {
                DialogAlert.genericDialog("¡No se Encontró Registro de Asistencia para Hoy!", "SIN REGISTRO EN BASE DE DATOS : 404", 1);
                return null;
            }
        } catch (SQLException e) {
            DialogAlert.genericDialog("¡Error al Consultar Diferencia de Horas!", "ERROR AL CONSULTAR", 1);
        }
        return null;
    }

    public List<Usuario> filtrarUsuarios(String nombre) {
        String sql = "SELECT * FROM Usuarios WHERE nombre LIKE ?;";
        ArrayList<Usuario> usuarios = new ArrayList<>();

        try {
            cn = Conexion.getMySQL();

            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, nombre + "%");

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Usuario usuario = new Usuario(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getDate(8).toLocalDate()
                );
                usuarios.add(usuario);
            }

            return usuarios;
        } catch (SQLException e) {
            dialog.showAlert(400, e);
        }
        return null;
    }
    
    public List<Usuario> filtrarUsuarios(String nombre, String dia) {
        String sql = "SELECT u.* FROM Usuarios u "
                + "INNER JOIN detalleTurnos d ON u.idUsuario=d.idUsuario "
                + "INNER JOIN dias ds ON d.idDia=ds.idDia "
                + "WHERE u.nombre LIKE ? "
                + "AND ds.nombre=?;";
        ArrayList<Usuario> usuarios = new ArrayList<>();

        try {
            cn = Conexion.getMySQL();

            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, nombre + "%");
            ps.setString(2, dia);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Usuario usuario = new Usuario(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getDate(8).toLocalDate()
                );
                usuarios.add(usuario);
            }

            return usuarios;
        } catch (SQLException e) {
            dialog.showAlert(400, e);
        }
        return null;
    }

public List<Usuario> ListaPorRangoFecha(String fechaInicio, String fechaFinal, int idEstado) {
    List<Usuario> lista = new ArrayList<>();
    
    String sql = "SELECT u.idUsuario, u.nombre, u.apellido, COUNT(u.idUsuario) AS totalAsistencia "
               + "FROM ASISTENCIAS a "
               + "INNER JOIN USUARIOS u ON a.idUsuario = u.idUsuario "
               + "WHERE a.fecha BETWEEN ? AND ? ";
    
    if (idEstado != 0) {
        sql += "AND a.idEstado = ? ";
    }
    sql += "GROUP BY u.idUsuario, u.nombre, u.apellido "
         + "ORDER BY u.idUsuario;";
    try {
        cn = Conexion.getMySQL();
        try (PreparedStatement ps = cn.prepareStatement(sql)) {
            // Establecer los parámetros en el PreparedStatement
            ps.setString(1, fechaInicio);
            ps.setString(2, fechaFinal);
            
            if (idEstado != 0) {
                ps.setInt(3, idEstado);
            }
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    int idUsuario = rs.getInt(1);
                    String nombre = rs.getString(2);
                    String apellido = rs.getString(3);
                    int totalAsistencia = rs.getInt(4);

                    Usuario nuevoUsuario = new Usuario(idUsuario, nombre, apellido, totalAsistencia);
                    lista.add(nuevoUsuario);
                }
            }
        }
    } catch (SQLException e) {
        e.printStackTrace(); 
        dialog.showAlert(400, e);
    }
    return lista;
}

}
