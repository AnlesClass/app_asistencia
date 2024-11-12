package Entities;
;
import java.time.LocalDate;
import java.time.LocalTime;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Asistencia {
    int idAsistencia;
    int idUsuario;
    LocalDate fecha;
    LocalTime horaEntrada;
    LocalTime horaSalida;
    int idEstado;

    public Asistencia(int idUsuario, LocalDate fecha, LocalTime horaEntrada, LocalTime horaSalida, int idEstado) {
        this.idUsuario = idUsuario;
        this.fecha = fecha;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.idEstado = idEstado;
    }
}
