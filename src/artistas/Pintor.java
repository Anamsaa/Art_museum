package artistas;

import java.util.*; 
import obradearte.*; 

public class Pintor extends Artista {
    //Atributos
    private String estiloPredominante;
    
    //Constructor vacio
    public Pintor(){
    }
    
    //Constructor con parámetros 
    public Pintor(String nombre, String nacionalidad, String estiloPredominante){
        super(nombre, nacionalidad, new ArrayList<ObraDeArte>()); 
        this.estiloPredominante = estiloPredominante;
    }
    
    //Getters y Setters 
    public String getEstiloPredominante(){
        return estiloPredominante;
    }
    
    @Override
    public String getTipo() {
       return "Pintor";
    }

    @Override
    public String toString() {
        return "Nombre del pintor: " + getNombre() + "\n" + "Nacionalidad: " + getNacionalidad() + "\n" + "Estilo predominante: " + estiloPredominante + "\n";
    }
}
