package excepciones;

public class NotFoundException extends Exception {
    
    public NotFoundException(){
        super("Opción no encontrada"); 
    }
    
    public NotFoundException(String message){
        super(message); 
    }
    
}
