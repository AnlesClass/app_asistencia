package Entities;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DetalleTurno {
    private int idDetalleTurno;
    private int idUsuario;
    private int idTurno;
    private String dia;

    public DetalleTurno(int idUsuario, int idTurno, String dia) {
        this.idUsuario = idUsuario;
        this.idTurno = idTurno;
        this.dia = dia;
    }
}
