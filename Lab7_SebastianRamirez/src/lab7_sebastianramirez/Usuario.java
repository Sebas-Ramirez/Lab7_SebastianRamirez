package lab7_sebastianramirez;

import java.io.Serializable;

public class Usuario implements Serializable{
    private String Nombre,Usario,Contraseña;
    int edad;
    private static final long SerialVersionUID = 900L;
    public Usuario(String Nombre, String Usario, String Contraseña, int edad) {
        this.Nombre = Nombre;
        this.Usario = Usario;
        this.Contraseña = Contraseña;
        this.edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getUsario() {
        return Usario;
    }

    public void setUsario(String Usario) {
        this.Usario = Usario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
