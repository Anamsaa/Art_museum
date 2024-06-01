package artmuseum;

public class Visitante {
    
    public int contadorId = 0; 
    
    private String nombre;
    private int edad; 
    private int idVisitante; 
    
    //Constructor vacio
    public Visitante(){
    }
    
    //Constructor con parámetros
    public Visitante(String nombre, int edad){
        this.nombre = nombre; 
        this.edad = edad; 
        this.idVisitante = generarId();
    }
    
    //Getters y Setters
    
    public String getNombre(){
        return nombre;
    }
    
    public int edad(){
        return edad;
    }
    
    public int getIdVisitante(){
        return idVisitante;
    }
    
    //Método para incrementar el contador
    private int generarId(){
        contadorId++; 
        return contadorId; 
    }
    
    //Métodos de protesta
    public void lanzarSopaDeTomate(Celador celador){
        System.out.println("Visitante Nº: " + idVisitante 
                + " ha lanzado sopa de tomate a una obra de arte! ");
        celador.activarAlarma();
    }
    
    public void hacerGraffiti(Celador celador){
        System.out.println("Visitante Nº: " + idVisitante 
                + " ha hecho un graffiti en una obra de arte! ");
        celador.activarAlarma();
    }
   
}
