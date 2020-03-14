package lab7_sebastianramirez;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class adminBinario implements Serializable {
    File archivoSolistas = new File("./Solistas.sr");
    File archivoBandas = new File("./Bandas.sr");
    File archivoUsuarios = new File("./Usuarios.sr");
    File archivoEventos = new File("./Eventos.sr");
    FileInputStream fs = null;
    ObjectInputStream os = null;
    public ArrayList getSolistas(){
        ArrayList <Solista>solistas = new ArrayList();
        try{
            Solista temp;
            if(archivoSolistas.exists()){
                try{
                    fs= new FileInputStream(archivoSolistas);
                    os= new ObjectInputStream(fs);
                    while ((temp = (Solista)os.readObject())!=null) {
                        solistas.add(temp);
                    }
                }catch (EOFException ex) {
                }
                os.close();
                fs.close();
            }
        }catch (Exception ex) {
             ex.printStackTrace();
        }return solistas;
    }
    public ArrayList getBandas(){
        ArrayList <Banda>bandas = new ArrayList();
        try{
            Banda temp;
            if(archivoBandas.exists()){
                fs= new FileInputStream(archivoSolistas);
                os= new ObjectInputStream(fs);
                try{
                    while ((temp = (Banda)os.readObject())!=null) {
                        bandas.add(temp);
                    }
                }catch (EOFException ex) {
                }
                os.close();
                fs.close();
            }
        }catch (Exception ex) {
             ex.printStackTrace();
        }return bandas;
    }
    public ArrayList getUsuarios(){
        ArrayList <Usuario>usuarios = new ArrayList();
        try{
            Usuario temp;
            if(archivoUsuarios.exists()){
                fs= new FileInputStream(archivoUsuarios);
                os= new ObjectInputStream(fs);
                try{
                    while ((temp = (Usuario)os.readObject())!=null) {
                        usuarios.add(temp);
                    }
                }catch (EOFException ex) {
                }
                os.close();
                fs.close();
            }
        }catch (Exception ex) {
             ex.printStackTrace();
        }return usuarios;
    }
    public ArrayList getEventos(){
        ArrayList <Evento>eventos = new ArrayList();
        try{
            Evento temp;
            if(archivoEventos.exists()){
                fs= new FileInputStream(archivoEventos);
                os= new ObjectInputStream(fs);
                try{
                    while ((temp = (Evento)os.readObject())!=null) {
                        eventos.add(temp);
                    }
                }catch (EOFException ex) {
                }
                os.close();
                fs.close();
            }
        }catch (Exception ex) {
             ex.printStackTrace();
        }return eventos;
    }
    
}
