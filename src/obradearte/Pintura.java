package obradearte;

public class Pintura extends ObraDeArte {
    
    private double altura; 
    private double anchura; 
    
    //Constructor vacio 
    public Pintura(){
    }
    
    //Constructor con parámetros 
    public Pintura(String nombre, String artista, int año, double altura, double anchura){
        super(nombre, artista, año); 
        this.altura = altura; 
        this.anchura = anchura;
    }
   
    @Override
    public double calcularDimensiones() {
        return altura * anchura;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() 
                + "\n" + "Artista: " + getArtista() 
                + "\n" + "Año: " + getAño() 
                + "\n" + "Tamaño: " + calcularDimensiones();
    }

    @Override
    public String getTipo() {
        return "Pintura";
    }
    
}
