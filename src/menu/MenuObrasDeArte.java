package menu;

import excepciones.NotFoundException;
import java.util.*;
import obradearte.*;

public class MenuObrasDeArte implements MenuActions {
    private final Map<Integer, ObraDeArte> obrasPorId = new HashMap<>();
    private final Map<String, ObraDeArte> obrasPorNombre = new HashMap<>();
    private final Scanner sc = new Scanner(System.in);
    private int obraCounter = 1;

    public void iniciar() {
        while (true) {
            System.out.println("\n--- Menu de Obras de Arte ---");
            System.out.println("1. Agregar Obra de Arte");
            System.out.println("2. Listar Obras de Arte");
            System.out.println("3. Modificar Obra de Arte");
            System.out.println("4. Eliminar Obra de Arte");
            System.out.println("5. Buscar Obra de Arte");
            System.out.println("6. Calcular antiguedad de la Obra de Arte");
            System.out.println("7. Volver al Menu Principal");
            System.out.print("Elige una opcion: ");

            int opcion = comprobarInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> agregar();
                case 2 -> listar();
                case 3 -> modificar();
                case 4 -> eliminar();
                case 5 -> buscar();
                case 6 -> calcularAntiguedad();
                case 7 -> {
                    return;
                }
                default -> System.out.println("Opcion no valida. Intentalo de nuevo.");
            }
        }
    }
    
    
    public void calcularAntiguedad(){
        
        System.out.println("Calcule la antiguedad de una obra de arte: ");
        listar();
        System.out.print("Introduce el ID de la obra a modificar: ");
        int id = sc.nextInt();
        sc.nextLine();
        
        ObraDeArte obra = obrasPorId.get(id);
        if (obra != null){
            int antiguedad = obra.calcularAntiguedad();
            System.out.println("La antiguedad de la obra de arte es: " + antiguedad + "años");
        }else{
            System.out.println("ID de obra de arte no encontrado");
        }
        
    }
    
    @Override
    public void agregar() {
        System.out.println("\n--- Agregar Nueva Obra de Arte ---");
        System.out.print("Nombre de la obra: ");
        String nombre = sc.nextLine();
        System.out.print("Artista: ");
        String artista = sc.nextLine();
        System.out.print("Año: ");
        int año = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduzca un numero: ");
        System.out.println("Tipo de obra (1. Pintura, 2. Fotografía, 3. Escultura): ");
        int tipo = sc.nextInt();
        sc.nextLine();

        ObraDeArte nuevaObra = null;
        switch (tipo) {
            case 1 -> {
                System.out.print("Altura de la pintura: ");
                double altura = sc.nextDouble();
                System.out.print("Anchura de la pintura: ");
                double anchura = sc.nextDouble();
                nuevaObra = new Pintura(nombre, artista, año, altura, anchura);
            }
            case 2 -> {
                System.out.print("Altura de la fotografia: ");
                double altura = sc.nextDouble();
                System.out.print("Anchura de la fotografia: ");
                double anchura = sc.nextDouble();
                nuevaObra = new Fotografia(nombre, artista, año, altura, anchura);
            }
            case 3 -> {
                System.out.print("Altura de la escultura: ");
                double altura = sc.nextDouble();
                System.out.print("Anchura de la escultura: ");
                double anchura = sc.nextDouble();
                System.out.print("Profundidad de la escultura: ");
                double profundidad = sc.nextDouble();
                nuevaObra = new Escultura(nombre, artista, año, altura, anchura, profundidad);
            }
            default -> System.out.println("Tipo de obra no valido.");
        }

        if (nuevaObra != null) {
            int id = obraCounter++;
            obrasPorId.put(id, nuevaObra);
            obrasPorNombre.put(nombre.toLowerCase(), nuevaObra);
            System.out.println("Id de obra de arte: " + id);
        }
    }
    
    @Override
    public void listar() {
        System.out.println("\n--- Lista de Obras de Arte ---");
        for (Map.Entry<Integer, ObraDeArte> entry : obrasPorId.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " - " + entry.getValue());
        }
    }

    @Override 
    public void modificar() {
        System.out.println("\n--- Modificar Obra de Arte ---");
        listar();
        System.out.print("Introduce el ID de la obra a modificar: ");
        int id = sc.nextInt();
        sc.nextLine();

        ObraDeArte obra = obrasPorId.get(id);
        if (obra != null) {
            System.out.print("Nuevo nombre de la obra (dejar en blanco para no cambiar): ");
            String nuevoNombre = sc.nextLine();
            System.out.print("Nuevo artista de la obra (dejar en blanco para no cambiar): ");
            String nuevoArtista = sc.nextLine();
            System.out.print("Nuevo año de la obra (dejar en blanco para no cambiar): ");
            String nuevoAño = sc.nextLine();

            if (!nuevoNombre.isEmpty()) {
                obrasPorNombre.remove(obra.getNombre().toLowerCase());
                obra.setNombre(nuevoNombre);
                obrasPorNombre.put(nuevoNombre.toLowerCase(), obra);
            }
            if (!nuevoArtista.isEmpty()) {
                obra.setArtista(nuevoArtista);
            }
            if (!nuevoAño.isEmpty()) {
                obra.setAño(Integer.parseInt(nuevoAño));
            }
            System.out.println("Obra de arte modificada correctamente.");
        } else {
            System.out.println("ID de obra de arte no encontrado.");
        }
    }

    @Override
    public void eliminar() {
        System.out.println("\n--- Eliminar Obra de Arte ---");
        listar();
        System.out.print("Introduce el ID de la obra a eliminar: ");
        int id = sc.nextInt();
        sc.nextLine();

        ObraDeArte obra = obrasPorId.remove(id);
        if (obra != null) {
            obrasPorNombre.remove(obra.getNombre().toLowerCase());
            System.out.println("Obra de arte eliminada correctamente.");
        } else {
            System.out.println("ID de obra de arte no encontrado.");
        }
    }

    @Override
    public void buscar() {
        System.out.println("\n--- Buscar Obra de Arte ---");
        System.out.print("Introduce el nombre de la obra a buscar: ");
        String nombre = sc.nextLine();

        ObraDeArte obra = obrasPorNombre.get(nombre.toLowerCase());
        if (obra != null) {
            System.out.println("Obra de arte encontrada: " + obra);
        } else {
        System.out.println("Nombre de obra de arte no encontrado.");
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
                if(num < 1 || num > 7) throw new NotFoundException();
                valido = true;
            }catch(InputMismatchException e){
                System.err.println("Inserte un numero valido");
                valido = false;
                sc.next();
            }catch(NotFoundException e){
                System.err.println(e.getMessage());
                System.err.println("Inserte un numero valido");
                valido = false;
                sc.next();
            }  
        } while(!valido);
        
        return num;          
    }
}