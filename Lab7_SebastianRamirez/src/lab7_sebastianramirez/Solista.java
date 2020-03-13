package lab7_sebastianramirez;

import java.io.Serializable;
import java.util.ArrayList;

public class Solista extends Artista implements Serializable{   
    int edad;
    ArrayList<Canciones> canciones;

    public Solista(String Usuario, String Contraseña, String Nombre, String Genero_Musical, int edad) {
        super(Usuario, Contraseña, Nombre, Genero_Musical);
        this.edad = edad;
    }
    
}
