package artistas;

import obradearte.*;
import java.util.*;

public abstract class Artista {
    
    //Atributos
    private String nombre; 
    private String nacionalidad; 
    private List<ObraDeArte> obrasDeArte;
    
    //Constructor vacio
    public Artista(){
    }
    
    //Constructor con párametros 
    public Artista(String nombre, String nacionalidad, List<ObraDeArte> obrasDeArte){
        this.nombre = nombre; 
        this.nacionalidad = nacionalidad; 
        this.obrasDeArte = obrasDeArte; 
    }

    //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
    
    public void agregarObraDeArte(ObraDeArte obra){
        obrasDeArte.add(obra); 
    }
    
    public List<ObraDeArte> getObrasDeArte(){
        return obrasDeArte; 
    }
    
    //Métodos abstractos 
    public abstract String getTipo();
    
    @Override
    public abstract String toString(); 
}
