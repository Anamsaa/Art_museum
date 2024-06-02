package artmuseum;

import excepciones.*;
import persona.*;
import menu.*; 
import java.util.*; 

public class Artmuseum {

    public static void main(String[] args) {
     
        // - - - - - - - - - - - Menú principal - - - - - - - - - - - - //
        
        Scanner sc = new Scanner(System.in);
        MenuArtistas menuArtistas = new MenuArtistas();
        MenuObrasDeArte menuObras = new MenuObrasDeArte();
       

        while (true) {
            System.out.println("\n--- Menu Principal ---");
            System.out.println("1. Menu de Artistas");
            System.out.println("2. Menu de Obras de Arte");
            System.out.println("3. Caso Celador");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");

            int opcion = comprobarInt();
            System.out.println("Presiona enter para continuar");
            sc.nextLine();

            switch (opcion) {
                case 1 -> menuArtistas.iniciar();
                case 2 -> menuObras.iniciar();
                case 3 -> probarCelador();
                case 4 -> {
                    System.out.println("Saliendo...");
                    return;
                }
                default -> System.out.println("Opcion no valida. Intentalo de nuevo.");
            }
        }   
    }
    
    static int comprobarInt(){
        Scanner sc = new Scanner(System.in);
        int num = 0; 
        boolean valido; 
        do{
            try{
                num = sc.nextInt();
                sc.nextLine(); 
                if(num < 1 || num > 4) throw new NotFoundException();
                valido = true;
            }catch(InputMismatchException e){
                System.err.println("Inserte un numero valido");
                valido = false;
            }catch(NotFoundException e){
                System.err.println("Esta opcion no esta disponible");
                System.err.println("Inserte un numero valido");
                valido = false;
                sc.next();
            }  
        } while(!valido);
        
        return num;          
    }
    
    //- - - - - - - - - - -  Pruebas del celador - - - - - - - - - - - -//
    
    public static void probarCelador(){
        Celador celador = new Celador("Juan");
        Visitante visitante = new Visitante("Pedro", 25);

        // El visitante realiza un acto vandálico
        visitante.lanzarSopaDeTomate();

        // El celador monitorea la actividad del visitante
        celador.monitorearActividad(visitante);
    }
}
