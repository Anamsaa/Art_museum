package artmuseum;

import excepciones.*;
import java.io.File;
import java.io.FileNotFoundException;
import persona.*;
import menu.*; 
import java.util.*; 

public class Main {

    public static void main(String[] args){
     
        // - - - - - - - - - - - Menú principal - - - - - - - - - - - - //
        
        Scanner sc = new Scanner(System.in);
        MenuArtistas menuArtistas = new MenuArtistas();
        MenuObrasDeArte menuObras = new MenuObrasDeArte();
       

        while (true) {
            System.out.println("\n--- Menu Principal ---");
            System.out.println("1. Menu de Artistas");
            System.out.println("2. Menu de Obras de Arte");
            System.out.println("3. Caso Celador");
            System.out.println("4. Invitacion al Museo");
            System.out.println("5. Salir");
            System.out.print("Elige una opcion: ");

            int opcion = comprobarInt();
            System.out.println("Presiona enter para continuar");
            sc.nextLine();

            switch (opcion) {
                case 1 -> menuArtistas.iniciar();
                case 2 -> menuObras.iniciar();
                case 3 -> probarCelador();
                case 4 -> leerArchivo("C:\\Users\\34642\\Documents\\NetBeansProjects\\artmuseum\\src\\artmuseum\\Invitacion.txt");
                case 5 -> {
                    System.out.println("Saliendo...");
                    return;
                }
                default -> System.out.println("Opcion no valida. Intentalo de nuevo.");
            }
        } 
    }
    
    //- - - - - - - - - - -  Tratamiento de excepciones - - - - - - - - - - - -//
    static int comprobarInt(){
        Scanner sc = new Scanner(System.in);
        int num = 0; 
        boolean valido; 
        do{
            try{
                num = sc.nextInt();
                sc.nextLine(); 
                if(num < 1 || num > 5) throw new NotFoundException();
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
        Celador celador = new Celador("Maximo");
        Visitante visitante = new Visitante("Yesua", 23);

        visitante.lanzarSopaDeTomate();
        celador.monitorearActividad(visitante);
    }
    
    
    //- - - - - - - - - - -  Prueba de ficheros - - - - - - - - - - - -//
    public static void leerArchivo(String rutaArchivo) {
        try {
            File archivo = new File(rutaArchivo);
            Scanner sc = new Scanner(archivo);
            
            System.out.println("Contenido del archivo " + rutaArchivo + ":");
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                System.out.println(linea);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("El archivo " + rutaArchivo + " no se encuentra.");
            e.printStackTrace();
        }
    }
 
}
