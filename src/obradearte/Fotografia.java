package obradearte;

public class Fotografia extends ObraDeArte {
    
    private double altura; 
    private double anchura; 
    
    //Constructor vacio 
    public Fotografia(){
    }
    
    //Constructor con parámetros
    public Fotografia(String nombre, String artista, int año, double altura, double anchura){
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
        return "Nombre: " + getNombre() + "\n" + "Artista: " + getArtista() + 
                "\n" + "Año: " + getAño() + "\n" + "Tamaño: " + calcularDimensiones();
    }

    @Override
    public String getTipo() {
        return "Fotografia";
    }
    
}
