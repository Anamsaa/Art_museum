package artmuseum;

import java.util.*; 

public class Celador {
    
    int contadorId = 0;
    private String nombre; 
    private static Set<String> idCeladores = new HashSet<>(); 
    private int idCelador;
    
    //Constructor vacio 
    public Celador(){
    }
    
    //Constructor con parámetros
    public Celador(String nombre){
        this.nombre = nombre; 
        this.idCelador = contadorId++; 
    }
    
    //Getters y Setters 
    
    public String getNombre(){
        return nombre;
    }
    
    public int getIdCelador(){
        return idCelador;
    }
    
    
    //Métodos propios
    public void activarAlarma(){
        System.out.println("EMERGENCIA. Alarma activada por: " + nombre);
    }
    
    public void desactivarAlarma(){
        System.out.println("Alarma desactivada. Ha pasado el peligro");
    }
    
}
