package persona;

import java.util.HashSet;
import java.util.Set;

public class Celador extends Persona {
    
    //Los ID's propios de cada clase me permiten llevar un registro de cuantos existen por cada clase 
    private static int contadorId = 0;
    private int idCelador;
    private static Set<Integer> idCeladores = new HashSet<>();
    private boolean alarmaActivada = false;
    
    // Constructor con parámetros
    public Celador(String nombre){
        super(nombre); 
        this.idCelador = ++contadorId; 
        idCeladores.add(idCelador);
    }
    
    // Getters
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
        System.out.println("¡EMERGENCIA! Alarma activada por Celador " + getNombre());
        alarmaActivada = true;
    }
    
    public void desactivarAlarma(){
        System.out.println("Alarma desactivada. Peligro mitigado.");
    }

    @Override
    public String toString() {
        return "Celador ID: " + idCelador + "\n Nombre: " + getNombre(); 
    }
}
