package Entities;

import java.time.LocalDate;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    private int idUsuario;
    private int idCargo;
    private String nombre;
    private String apellido;
    private String dni;
    private String email;
    private String contrasenia;
    private LocalDate fechaContrato;
    
    
    // ATRIBUTOS PARA METODOS ESPECIFICOS
    private int totalAsistencia;  // este es para encontrar la cantidad de asistencia para un usuario (UsuarioService-> ListaPorRangoDeFecha)

    public Usuario(int idUsuario, int idCargo, String nombre, String apellido, String dni, String email, String contrasenia, LocalDate fechaContrato) {
        this.idUsuario = idUsuario;
        this.idCargo = idCargo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.email = email;
        this.contrasenia = contrasenia;
        this.fechaContrato = fechaContrato;
    }
    
    public Usuario(int idCargo, String nombre, String apellido, String dni, String email, String contrasenia, LocalDate fechaContrato) {
        this.idCargo = idCargo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.email = email;
        this.contrasenia = contrasenia;
        this.fechaContrato = fechaContrato;
    }
    public Usuario(int idUsuario, String nombre, String apellido, int totalAsistencia){
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.totalAsistencia = totalAsistencia;
    }
    
    public String[] toArray(){
        String[] usuario = {
            String.valueOf(idUsuario),
            String.valueOf(idCargo),
            nombre,
            apellido,
            dni,
            email,
            contrasenia,
            String.valueOf(fechaContrato)
        };
        
        return usuario;
    }
}
