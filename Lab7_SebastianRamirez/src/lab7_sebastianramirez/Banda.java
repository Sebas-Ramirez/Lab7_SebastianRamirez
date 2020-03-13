package lab7_sebastianramirez;

import java.io.Serializable;

public class Banda extends Artista implements Serializable{
    int integrantes;
    
    public Banda(int integrantes, String Usuario, String Contraseña, String Nombre, String Genero_Musical) {
        super(Usuario, Contraseña, Nombre, Genero_Musical);
        this.integrantes = integrantes;
    }
    
}
