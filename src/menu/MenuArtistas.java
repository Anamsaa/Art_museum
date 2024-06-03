package menu;

import excepciones.NotFoundException;
import persona.*;
import java.util.*; 


public class MenuArtistas implements MenuActions {
    
    //A través de HashMap incorporamos una manera fácil de búsqueda 
    private Map<Integer, Artista> artistasPorId = new HashMap<>();
    private Map<String, Artista> artistasPorNombre = new HashMap<>();
    private Scanner sc = new Scanner(System.in);
    //Declaro una variable para el id del artista
    private int artistaCounter = 1;
    
    //Constructores 
    public MenuArtistas(){
    }

    public void iniciar() {
        while (true) {
            System.out.println("\n--- Menu de Artistas ---");
            System.out.println("1. Agregar Artista");
            System.out.println("2. Listar Artistas");
            System.out.println("3. Modificar Artista");
            System.out.println("4. Eliminar Artista");
            System.out.println("5. Buscar Artista");
            System.out.println("6. Volver al Menu Principal");
            System.out.print("Elige una opción: ");
            
            int opcion = comprobarInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> agregar();
                case 2 -> listar();
                case 3 -> modificar();
                case 4 -> eliminar();
                case 5 -> buscar();
                case 6 -> {
                    return;
                }
                default -> System.out.println("Opción no valida. Intentalo de nuevo.");
            }
        }
    }

    @Override
    public void agregar() {
        System.out.println("\n--- Agregar Nuevo Artista ---");
        System.out.print("Nombre del artista: ");
        String nombre = sc.nextLine();
        System.out.print("Nacionalidad del artista: ");
        String nacionalidad = sc.nextLine();
        System.out.println("Ingrese un numero");
        System.out.println("Tipo de artista (1. Escultor, 2. Fotografo, 3. Pintor): ");
        int tipo = sc.nextInt();
        sc.nextLine();
        
        //Declaro la variable nuevo artista
        Artista nuevoArtista;
        switch (tipo) {
            case 1 -> {
                System.out.print("Material preferido: ");
                String materialPreferido = sc.nextLine();
                nuevoArtista = new Escultor(nombre, nacionalidad, materialPreferido);
            }
            case 2 -> {
                System.out.println("Tipo de Fotografia: ");
                String tipoFotografia = sc.nextLine(); 
                nuevoArtista = new Fotografo(nombre, nacionalidad, tipoFotografia);
            }
            case 3 -> {
                System.out.print("Estilo Predominante: ");
                String estiloPredominante = sc.nextLine();
                nuevoArtista = new Pintor(nombre, nacionalidad, estiloPredominante);
            }
            default -> {
                System.out.println("Tipo de artista no valido. Intentalo de nuevo.");
                return;
            }
        }
        
        //Contador en aumento para el id
        int id = artistaCounter++;
        //HashMap para encontrar artistas por id 
        artistasPorId.put(id, nuevoArtista);
        //HashMap para realizar búsqueda por nombre 
        artistasPorNombre.put(nombre.toLowerCase(), nuevoArtista);
        System.out.println("Id de artista: " + id);
    }

    @Override
    public void listar() {
        System.out.println("\n--- Lista de Artistas ---");
        for (Map.Entry<Integer, Artista> entry : artistasPorId.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " - " + entry.getValue());
        }
    }

    @Override
    public void modificar() {
        System.out.println("\n--- Modificar Artista ---");
        listar();
        System.out.print("Introduce el ID del artista a modificar: ");
        int id = sc.nextInt();
        sc.nextLine();

        Artista artista = artistasPorId.get(id);
        if (artista != null) {
            System.out.print("Nuevo nombre del artista (dejar en blanco para no cambiar): ");
            String nuevoNombre = sc.nextLine();
            System.out.print("Nueva nacionalidad del artista (dejar en blanco para no cambiar): ");
            String nuevaNacionalidad = sc.nextLine();

            if(!nuevoNombre.isEmpty()){
                artistasPorNombre.remove(artista.getNombre().toLowerCase());
                artista.setNombre(nuevoNombre);
                artistasPorNombre.put(nuevoNombre.toLowerCase(), artista); 
            }
            
            if(!nuevaNacionalidad.isEmpty()){
                artista.setNacionalidad(nuevaNacionalidad);
            }
            System.out.println("Artista modificado correctamente.");
        } else {
            System.out.println("ID de artista no encontrado");
        }
    }
    
    @Override
    public void eliminar() {
        System.out.println("\n--- Eliminar Artista ---");
        listar();
        System.out.print("Introduce el ID del artista a eliminar: ");
        int id = sc.nextInt();
        sc.nextLine();

        Artista artista = artistasPorId.remove(id);
        if (artista != null) {
            artistasPorNombre.remove(artista.getNombre().toLowerCase());
            System.out.println("Artista eliminado correctamente.");
        } else {
            System.out.println("ID de artista no encontrado.");
        }
    }
    
    @Override
    public void buscar() {
        System.out.println("\n--- Buscar Artista ---");
        System.out.print("Introduce el nombre del artista a buscar: ");
        String nombre = sc.nextLine();

        Artista artista = artistasPorNombre.get(nombre.toLowerCase());
        if (artista != null) {
            System.out.println("Artista encontrado: " + artista);
        } else {
            System.out.println("Nombre de artista no encontrado.");
        }
    }

    public Map<Integer, Artista> getArtistas() {
        return artistasPorId;
    }
    
    static int comprobarInt(){
        Scanner sc = new Scanner(System.in);
        int num = 0; 
        boolean valido; 
        do{
            try{
                num = sc.nextInt();
                sc.nextLine(); 
                if(num < 1 || num > 6) throw new NotFoundException();
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
