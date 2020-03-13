package lab7_sebastianramirez;

import java.io.Serializable;

public class Artista implements Serializable{
    private String Usuario, Contraseña, Nombre,Genero_Musical;
    private static final long SerialVersionUID = 900L;
    public Artista(String Usuario, String Contraseña, String Nombre, String Genero_Musical) {
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
        this.Nombre = Nombre;
        this.Genero_Musical = Genero_Musical;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getGenero_Musical() {
        return Genero_Musical;
    }

    public void setGenero_Musical(String Genero_Musical) {
        this.Genero_Musical = Genero_Musical;
    }
    
}
