package obradearte;

public class Escultura extends ObraDeArte {
    
    private double altura; 
    private double anchura; 
    private double profundidad; 
    
    //Constructor vacio 
    public Escultura(){
    }
    
    //Constructor con parámetros 
    public Escultura(String nombre, String artista, int año, double altura, double anchura, double profundidad){
        super(nombre, artista, año);
        this.altura = altura;
        this.anchura = anchura; 
        this.profundidad = profundidad;
    }

    @Override
    public double calcularDimensiones() {
        return altura * anchura * profundidad;
    }
    
    @Override
    public String getTipo() {
       return "Escultura";
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() 
                + "\n" + "Artista: " + getArtista() 
                + "\n" +  "Año: " + getAño() 
                + "\n" + "Tamaño: " + calcularDimensiones()
                + "\n" + "Tipo: " + getTipo();
        
    }
}
