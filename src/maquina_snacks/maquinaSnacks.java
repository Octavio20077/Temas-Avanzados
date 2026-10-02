package maquina_snacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class maquinaSnacks {
    public static void main(String[] args) {
        maquinaSnacks();
    }
    public static void maquinaSnacks(){
        boolean salir = false;
        var consola = new Scanner(System.in);
        //creamos la lista de productos de tipo Snack
        List<Snack> productos = new ArrayList<>();
        System.out.println("***Maquina de Snacks***");
        Snacks.mostrarSnack();//mostrar inventario de snacks disponibles
        while (!salir){
            try {
            var opcion = mostrarMenu(consola);
            salir= ejecutarOpciones(opcion, consola, productos);
            }catch (Exception e){
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
            finally {
                System.out.println(); //imprime un salto de linea con cada iteracion
            }
        }
    }
    private static int mostrarMenu(Scanner consola){
        System.out.println("""
                Menu: 
                1. Comprar snack
                2. Mostrar ticket
                3. Agregar Nuevo Snack
                4. Salir 
                Elige una opcion: \s""");
        //leemos y retornamos la opcion seleccionada
        return Integer.parseInt(consola.nextLine());
    }
private static boolean ejecutarOpciones(int opcion, Scanner consola, List<Snack> productos){
        boolean salir = false;
        switch (opcion){
            case 1 -> comprarSnack(consola,productos);
            case 2 -> mostrarTicket(productos);
            case 3 -> agregarSnack(consola);
            case 4 -> {
                System.out.println("¡Regresa pronto!");
                salir = true;
            }
            default -> System.out.println("Opcion invalida: " + opcion);
        }
        return salir;
}
private static void comprarSnack(Scanner consola,
                                 List<Snack> productos){
    System.out.println("Que snack quieres comprar (id)?: ");
    var idSnack = Integer.parseInt(consola.nextLine());
    //vamos a validar que el snack exista en la lista de snacks
    boolean snackEncontrado = false;
    for (Snack snack: Snacks.getSnacks()){
        if (idSnack == snack.getIdSnacks()){
            //Agregamos el snack a la lista de productos encotrados
            productos.add(snack);
            System.out.println("Okay, Snack Agregado: " + snack);
            snackEncontrado = true;
            break;
        }
    }
    if (!snackEncontrado){
        System.out.println("Id de snack no encontrado: " + idSnack);
    }
}
private static void mostrarTicket(List<Snack> productos){
        String ticket = "***Ticket de vent***";
        double total = 0.0;
        for (var producto: productos){
            ticket += "\n\t-" + producto.getNombre() + " - $" + producto.getPrecio();
            total += producto.getPrecio();

        }
        ticket += "\n\tTotal -> $" + total;
    System.out.println(ticket);
    }

    private static void agregarSnack(Scanner consola){
        System.out.println("Ingresa el nombre del Snack nuevo: ");
        var nombre = consola.nextLine();
        System.out.println("Precio del snack");
        double precio = Double.parseDouble(consola.nextLine());
        Snacks.agregarSnack(new Snack(nombre, precio ));
        System.out.println("Tu snack se agrego correctamente");
        Snacks.mostrarSnack();
    }
}
