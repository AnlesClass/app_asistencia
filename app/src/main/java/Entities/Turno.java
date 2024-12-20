package Entities;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Turno {
    private int idTurno;
    private String nombre;
    private LocalTime horaInicio;
    private LocalTime horaFin;

    public Turno(String nombre, LocalTime horaInicio, LocalTime horaFin) {
        this.nombre = nombre;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }
}
