package artmuseum;

import menu.*; 
import java.util.*; 

public class Artmuseum {

    public static void main(String[] args) {
     
        // - - - - - - - - - - - Menú principal - - - - - - - - - - - - //
        
        Scanner sc = new Scanner(System.in);
        MenuArtistas menuArtistas = new MenuArtistas();
        MenuObrasDeArte menuObras = new MenuObrasDeArte();
       

        while (true) {
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1. Menu de Artistas");
            System.out.println("2. Menu de Obras de Arte");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");

            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> menuArtistas.iniciar();
                case 2 -> menuObras.iniciar();
                case 3 -> {
                    System.out.println("Saliendo...");
                    return;
                }
                default -> System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }
    }
}
