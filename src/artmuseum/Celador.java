package artmuseum;

import java.util.HashSet;
import java.util.Set;

public class Celador {
    
    private static int contadorId = 0;
    private String nombre; 
    private int idCelador;
    private static Set<Integer> idCeladores = new HashSet<>();
    private boolean alarmaActivada = false;
    
    // Constructor con parámetros
    public Celador(String nombre){
        this.nombre = nombre; 
        this.idCelador = ++contadorId; 
        idCeladores.add(idCelador);
    }
    
    // Getters
    public String getNombre(){
        return nombre;
    }
    
    public int getIdCelador(){
        return idCelador;
    }
    
    // Métodos de alarma
    
    public void monitorearActividad(Visitante visitante){
        if(visitante.esActoVandalico()){
            activarAlarma();
        }
    }
    
    public void activarAlarma(){
        System.out.println("¡EMERGENCIA! Alarma activada por Celador " + nombre);
        alarmaActivada = true;
    }
    
    public void desactivarAlarma(){
        System.out.println("Alarma desactivada. Peligro mitigado.");
    }
}
