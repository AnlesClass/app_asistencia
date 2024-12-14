package Entities;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cargo {
    private int idCargo;
    private String nombre;
    private String descripcion;
    private int isAdmin;

    public Cargo(String nombre, String descripcion, int isAdmin) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.isAdmin = isAdmin;
    }
}
