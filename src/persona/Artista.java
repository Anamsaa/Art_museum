package persona;

import obradearte.*;
import java.util.*;

public abstract class Artista extends Persona{
    
    //Atributos
    private String nacionalidad; 
    static String tipo;
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

    public String getNacionalidad() {
        return nacionalidad;
    }
    
//    public void agregarObraDeArte(ObraDeArte obra){
//        obrasDeArte.add(obra); 
//    }
//    
    public List<ObraDeArte> getObrasDeArte(){
        return obrasDeArte; 
    }
    
    //Métodos abstractos 
    public abstract String getTipo();
    
}
