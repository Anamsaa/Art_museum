package persona;

public class Visitante extends Persona {
    
    private static int contadorId = 0;
    private int edad; 
    private int idVisitante;
    private boolean actoVandalico = false;
    
    // Constructor con parámetros
    public Visitante(String nombre, int edad){
        super (nombre);
        this.edad = edad; 
        this.idVisitante = ++contadorId;
    }
    
    // Getters y Setters 
    public int getEdad() {
        return edad;
    }
    
    public int getIdVisitante(){
        return idVisitante;
    }
    
    // Métodos de protesta
    public void lanzarSopaDeTomate(){
        System.out.println("Visitante Nº " + idVisitante 
                + " ha lanzado sopa de tomate a una obra de arte.");
        actoVandalico = true;
    }
    
    public void hacerGraffiti(Celador celador){
        System.out.println("Visitante Nº " + idVisitante 
                + " ha hecho un graffiti en una obra de arte.");
        actoVandalico = true;
    }
    
    public boolean esActoVandalico(){
        return actoVandalico;
    }

    @Override
    public String toString() {
        return "Visitante Nº: " + idVisitante  + "\n Edad: "+ edad;
    }
}