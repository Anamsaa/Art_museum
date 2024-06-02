package persona;

import java.util.*; 
import obradearte.*; 

public class Fotografo extends Artista {
    
    //Atributos
    private String tipoFotografia;
    
    //Constructor vacio
    public Fotografo(){
    }
    
    //Constructor con parámetros 
    public Fotografo(String nombre, String nacionalidad, String tipoFotografia){
        super(nombre, nacionalidad, new ArrayList<ObraDeArte>()); 
        this.tipoFotografia = tipoFotografia;
    }
    
    //Getters y Setters
    public String getTipoFotografia(){
        return tipoFotografia;
    }
    
    @Override
    public String getTipo(){
        return "Fotógrafo"; 
    }

    @Override
    public String toString() {
        return "Nombre fotografo: " + getNombre() 
                + "\n" + "Nacionalidad: " + getNacionalidad() 
                + "\n" + "Tipo de fotografia: " + tipoFotografia 
                + "\n" + "Tipo de artista: " + getTipo();
    }
}
