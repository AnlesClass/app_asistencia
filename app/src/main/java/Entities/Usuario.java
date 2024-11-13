package Entities;

import java.time.LocalDate;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    int idUsuario;
    int idCargo;
    String nombre;
    String apellido;
    String dni;
    String email;
    String contrasenia;
    LocalDate fechaContrato;

    public Usuario(int idCargo, String nombre, String apellido, String dni, String email, String contrasenia, LocalDate fechaContrato) {
        this.idCargo = idCargo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.email = email;
        this.contrasenia = contrasenia;
        this.fechaContrato = fechaContrato;
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
