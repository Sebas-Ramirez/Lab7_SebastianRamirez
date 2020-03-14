package lab7_sebastianramirez;

import java.io.Serializable;
import java.util.Date;

public class Evento implements Serializable {
    private Date fecha;
    private String Ciudad, Lugar, Capacidad_de_Personas;

    public Evento(Date fecha, String Ciudad, String Lugar, String Capacidad_de_Personas) {
        this.fecha = fecha;
        this.Ciudad = Ciudad;
        this.Lugar = Lugar;
        this.Capacidad_de_Personas = Capacidad_de_Personas;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }

    public String getCapacidad_de_Personas() {
        return Capacidad_de_Personas;
    }

    public void setCapacidad_de_Personas(String Capacidad_de_Personas) {
        this.Capacidad_de_Personas = Capacidad_de_Personas;
    }

    @Override
    public String toString() {
        return Lugar;
    }
    
}
