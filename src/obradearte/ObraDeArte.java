package obradearte;

import java.time.LocalDate;

public abstract class ObraDeArte {
    
    private String nombre; 
    private String artista; 
    private int año;
    
    //Constructor vacio
    public ObraDeArte(){
    }
    
    //Constructor con parámetros
    public ObraDeArte(String nombre, String artista, int año){
        this.nombre = nombre; 
        this.artista = artista; 
        this.año = año; 
    }
    
    //Getters y setters 
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getArtista(){
        return artista;
    }
    
    public void setArtista(String artista){
        this.artista = artista; 
    }
    
    public int getAño(){
        return año;
    }
    
    public void setAño(int año){
        this.año = año; 
    }
    
    
    //Métodos abstractos 
    //Método que me permite calcular las dimensiones de cada obra de Arte
    public abstract double calcularDimensiones(); 
    
    public abstract String getTipo();
    
    @Override 
    public abstract String toString();
    
    //Métodos propios
    //Calcular antiguedad con respecto al año actual
    public int calcularAntiguedad(){
        int añoActual = LocalDate.now().getYear(); 
        return añoActual - año;
    }
   
}
