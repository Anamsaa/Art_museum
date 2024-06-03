package persona;

public abstract class Persona {
    
    //Atributos
    private static int contadorId = 0; 
    private int idPersona; 
    private String nombre; 
    
    //Constructor vacio
    public Persona(){
    }
    
    //Constructor con parámetros
    public Persona(String nombre){
        //Cada persona obtiene su ID, cuando se crea una instancia de esta
        this.idPersona = ++contadorId; 
        this.nombre = nombre;
    }
    
    //Getters y setters 
    public int getIdPersona(){
        return idPersona;
    }
    
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Métodos abstractos 
    @Override
    public abstract String toString(); 
}
