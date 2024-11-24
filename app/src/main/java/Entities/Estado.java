package Entities;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Estado {
    private int idEstado;
    private String nombre;
    private String abreviatura;
    
    public Estado(String nombre, String abreviatura){
        this.nombre = nombre;
        this.abreviatura = abreviatura;
    }
}
