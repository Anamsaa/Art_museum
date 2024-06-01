package artistas;

import java.util.*; 
import obradearte.*; 

public class Escultor extends Artista {

    //Atributos
    private String materialPreferido;
    
    //Constructores 
    public Escultor(){
    }
    
    public Escultor(String nombre, String nacionalidad, String materialPreferido){
        //Inicializo la lista de obras de arte para guardar las obras de cada artista
        super(nombre, nacionalidad, new ArrayList<ObraDeArte>()); 
        this.materialPreferido = materialPreferido;
    }
    
    //Getters y setters 
    public String getMaterialPreferido(){
        return materialPreferido;
    }
    
    @Override
    public String getTipo(){
        return "Escultor";
    }

    @Override
    public String toString() {
        return "Nombre escultor: " + getNombre() + "\n" + "Nacionalidad: " + getNacionalidad() + "\n" + "Material Preferido: " + materialPreferido + "\n";
    }
    
}
