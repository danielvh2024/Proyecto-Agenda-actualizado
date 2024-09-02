package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Reunion {
    private String descripcion;
    private String fecha;
    private String hora;
    private List<Contacto> asistentes;

    public Reunion(String descripcion, String fecha, String hora){
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.asistentes = new ArrayList<>();
        assert !descripcion.isBlank();
        assert !fecha.isBlank();
        assert !hora.isBlank();
    }
    public void agregarAsistente(Contacto contacto) {
        asistentes.add(contacto);
    }

    public void eliminarAsistente(Contacto contacto) {
        asistentes.remove(contacto);
    }

    public List<Contacto> getAsistentes() {
        return asistentes;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Reunion descripcion=" + descripcion + ", fecha=" + fecha + ", hora=" + hora + ", asistentes="
                + asistentes + "]";
    }
    
    
    
}
