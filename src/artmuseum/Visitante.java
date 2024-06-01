package artmuseum;

public class Visitante {
    
    private static int contadorId = 0; 
    private String nombre;
    private int edad; 
    private int idVisitante;
    private boolean actoVandalico = false;
    
    // Constructor con parámetros
    public Visitante(String nombre, int edad){
        this.nombre = nombre; 
        this.edad = edad; 
        this.idVisitante = ++contadorId;
    }
    
    // Getters
    public String getNombre(){
        return nombre;
    }
    
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
}