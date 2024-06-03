package excepciones;

public class NotFoundException extends Exception {
    
    public NotFoundException(){
        super("Esta opcion no esta disponible :("); 
    }
    
    public NotFoundException(String message){
        super(message); 
    }
    
}
