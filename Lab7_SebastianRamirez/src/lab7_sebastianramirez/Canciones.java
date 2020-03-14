package lab7_sebastianramirez;

import java.io.Serializable;

public class Canciones implements Serializable{
    private String nombre,duracion;

    public Canciones(String nombre, String duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
    
}
