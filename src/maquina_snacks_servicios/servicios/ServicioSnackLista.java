package maquina_snacks_servicios.servicios;

import maquina_snacks_servicios.dominio.Snack;

import java.util.ArrayList;
import java.util.List;

public class ServicioSnackLista implements IServicioSnacks{
    private static final List<Snack> snacks;

    //bloque statis inicializador
    static {
        snacks = new ArrayList<>();
        snacks.add(new Snack("Papas", 70));
        snacks.add(new Snack("Refresco", 50));
        snacks.add(new Snack("Sandwich", 120));
    }

    public  void agregarSnack(Snack snack){
        snacks.add(snack);
    }
    public  void mostrarSnack(){
        String inventarioSnacks = "";
        for (Snack snack: snacks){
            inventarioSnacks += snack.toString() + "\n";
        }
        System.out.println("----Snacks en el inventario");
        System.out.println(inventarioSnacks);
    }
    public   List<Snack> getSnacks(){
        return snacks;
    }
}
