package persona;

import obradearte.*;
import java.util.*;

public abstract class Artista extends Persona{
    
    //Atributos
    private String nacionalidad; 
    private List<ObraDeArte> obrasDeArte;
    
    //Constructor vacio
    public Artista(){
    }
    
    //Constructor con párametros 
    public Artista(String nombre, String nacionalidad, List<ObraDeArte> obrasDeArte){
        super(nombre); 
        this.nacionalidad = nacionalidad; 
        this.obrasDeArte = obrasDeArte; 
    }
    
    //Getters y setters 
    public String getNacionalidad() {
        return nacionalidad;
    }
    
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public List<ObraDeArte> getObrasDeArte(){
        return obrasDeArte; 
    }
    
//    public void agregarObraDeArte(ObraDeArte obra){
//        obrasDeArte.add(obra); 
//    }
//    
    
    //Métodos abstractos 
    public abstract String getTipo();
    
}
